
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class XMLUtil {
    public static Object getBean(){
        try {
            //todo:���� DOM �ĵ�����
            DocumentBuilderFactory documentBuilderFactory= DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document doc;
            doc = documentBuilder.parse("src\\CreationalPattern\\BuilderPattern\\config.xml");
            //todo:��ȡ�����������ı��ڵ�
            NodeList nodeList = doc.getElementsByTagName("className");
            Node classNode = nodeList.item(0).getFirstChild();
            String cName = classNode.getNodeValue();
            //todo:ͨ����������ʵ�����󲢽��䷵��
            Class clz = Class.forName(cName);
            Object obj = clz.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
