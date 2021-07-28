package ConcreteBuilder;
import AbstractBuilder.ActorBuilder;
import Product.Actor;

public class HeroBuilder extends ActorBuilder {
	private Actor actor;
	@Override
    public void buildType() {
        actor.setType("Ó¢ÐÛ");
    }

    @Override
    public void buildSex() {
        actor.setSex("ÄÐ");
    }

    @Override
    public void buildFace() {
        actor.setFace("Ó¢¿¡");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("Åû·ç");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("Æ®ÒÝ");
    }
}
