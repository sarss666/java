import AbstractBuilder.ActorBuilder;
import Director.ActorController;
import Product.Actor;

public class Client {
    public static void main(String[] args) {
        
        ActorBuilder actorBuilder;
        actorBuilder = (ActorBuilder)XMLUtil.getBean();

     
        ActorController actorController = new ActorController();
        Actor actor;
        actor = actorController.construct(actorBuilder);
        String type = actor.getType();
        System.out.println(type+"�����");
        System.out.println("�Ա�"+actor.getSex());
        System.out.println("���ݣ�"+actor.getFace());
        System.out.println("��װ��"+actor.getCostume());
        System.out.println("���ͣ�"+actor.getHairstyle());
    }
}
