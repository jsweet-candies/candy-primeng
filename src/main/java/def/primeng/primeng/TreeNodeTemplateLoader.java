package def.primeng.primeng;

import def.angular.core.TemplateRef;
import def.angular.core.ViewContainerRef;

public class TreeNodeTemplateLoader extends def.js.Object {
    public ViewContainerRef viewContainer;
    public Object node;
    public TemplateRef<?> template;
    public TreeNodeTemplateLoader(ViewContainerRef viewContainer){}
    native public void ngOnInit();
    protected TreeNodeTemplateLoader(){}
}

