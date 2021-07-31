package asas;

import java.util.Scanner;
public class Banker {
    int available[] = new int[]{3,3,2};//�ɵõ�����Դ
    int max[][] = new int[][]{{7,5,3},{3,2,2},{9,0,2},{2,2,2},{4,3,3}};//ÿ�����������Դ��
    int allocation[][] = new int[][]{{0,1,0},{2,0,0},{3,0,2},{2,1,1},{0,0,2}};//ÿ������Ŀǰӵ�е���Դ��
    int need[][] = new int[][]{{7,4,3},{1,2,2},{6,0,0},{0,1,1},{4,3,1}};//ÿ��������Ҫ����Դ��
    void showData() {
    //չʾ�������ÿ�����̵������
        System.out.println("���̺�   Max     All     Need   ");
        System.out.println("     A  B  C  A  B  C  A  B  C");
        for(int i = 0;i<5;i++){
            System.out.print(i+"    ");
            for(int m = 0;m<3;m++) System.out.print(max[i][m]+"  ");
            for(int m = 0;m<3;m++) System.out.print(allocation[i][m]+"  ");
            for(int m = 0;m<3;m++) System.out.print(need[i][m]+"  ");
            System.out.println();
        }
    }

    boolean change(int inRequestNum,int inRequest[])//��������
    {
        int requestNum = inRequestNum;
        int request[] = inRequest;
        // for(int i=0;i<3;i++)System.out.println("�޸�ǰavailable"+available[i]);
        if(!(request[0]<=need[requestNum][0]&&request[1]<=need[requestNum][1]&&request[2]<=need[requestNum][2]))
        {
            //request[0]<=need[requestNum][0]
            //request[1]<=need[requestNum][1]
            //request[2]<=need[requestNum][2]
            //ÿһ��������ԴС�ڵ�ǰ�߳�need����Դ��
            System.out.println("�������Դ������������Ҫ�����ֵ���������");
            return false;
        }
        if((request[0]<=available[0]&&request[1]<=available[1]&&request[2]<=available[2])==false)
        {
            //��ǰ�̵߳�ÿһ��������ԴС�ڵ�����Դ�ض�Ӧ��Դ������
            System.out.println("�����㹻��Դ���䣬����ȴ�");
            return false;
        }

        for(int i = 0;i<3;i++)//�Է������ݸ�������߳�
        {
            available[i] = available[i]-request[i];
            //��Դ�ص�ÿ����Դ��ȥÿ��������Դ����
            allocation[requestNum][i] = allocation[requestNum][i] + request[i];
            //��ǰ�߳�allocation��ÿ����Դ����ÿ����Դ��������
            need[requestNum][i] = need[requestNum][i] - request[i];
            //��ǰ�߳�need��ÿ����Դ������ȥÿ����Դ����������
        }
// for(int i=0;i<3;i++)System.out.println("�޸ĺ�available"+available[i]);
        boolean flag = checkSafe(available[0],available[1],available[2]);//���а�ȫ�Լ�鲢�����Ƿ�ȫ
// System.out.println("��ȫ�Լ���"+flag);
        if(flag==true)
        {
            System.out.println("�ܹ���ȫ����");
            return true;
        }
        else//����ͨ����ȫ�Լ�� �ָ���δ����ǰ������
        {
            System.out.println("���ܹ���ȫ����");
            for(int i = 0;i<3;i++)
            {
                available[i] = available[i]+request[i];
                allocation[requestNum][i] = allocation[requestNum][i] - request[i];
                need[requestNum][i] = need[requestNum][i] + request[i];
            }
            return false;
        }
    }
    boolean checkSafe(int a,int b,int c)//��ȫ�Լ��
    {
        int work[] = new int[3];
        work[0] = a;
        work[1] = b;
        work[2] = c;
        int i=0;
        boolean finish[] = new boolean[5];
        while(i<5)//Ѱ��һ���ܹ��������Ϊ��ɺ��ȥִ����һ����
        {
            if(finish[i]==false&&need[i][0]<=work[0]&&need[i][1]<=work[1]&&need[i][2]<=work[2])
            {//�ҵ�������޸�workֵ��Ȼ��i=0�����´ӿ�ʼ��Ϊ�������Ѱ��
                System.out.println("����ɹ�����"+i);
                for(int m = 0;m<3;m++)
                    work[m] =work[m] + allocation[i][m];
                finish[i] = true;
                i=0;
            }
            else//���û���ҵ�ֱ��i++
                i++;
        }
        for(i=0;i<5;i++)//ͨ��finish�����ж��Ƿ񶼿��Է���
        {
            if(finish[i]==false)
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Banker bank = new Banker();
        bank.showData();
        //�����߳���Դ��ŵ�����
        int request[] =new int[3];
        int requestNum;
        String source[] = new String[]{"A","B","C"};
        Scanner s = new Scanner(System.in);
        String choice = new String();
        while(true)//ѭ�����з���
        {
            System.out.println("������Ҫ����Ľ��̺ţ�0--4����");
            requestNum = s.nextInt();
            System.out.print("�������������Դ��Ŀ");
            for(int i = 0;i<3;i++)
            {
                System.out.println(source[i]+"��Դ����Ŀ��");
                request[i] = s.nextInt();
            }
            bank.change(requestNum, request);
            System.out.println("�Ƿ����������(y/n)");
            choice = s.next();
            if(choice.equals("n"))
                break;
        }
    }
}
