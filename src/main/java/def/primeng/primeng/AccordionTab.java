package def.primeng.primeng;
public class AccordionTab extends def.js.Object {
    public Accordion accordion;
    public String header;
    public Boolean selected;
    public Boolean disabled;
    public Object headerFacet;
    public Boolean animating;
    public AccordionTab(Accordion accordion){}
    native public void toggle(Object event);
    native public double findTabIndex();
    protected AccordionTab(){}
}

