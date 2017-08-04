package def.primeng.primeng;
import def.angular.core.EventEmitter;
import def.js.Function;
public class RadioButton extends def.js.Object {
    public Object value;
    public String name;
    public Boolean disabled;
    public String label;
    public EventEmitter<?> click;
    public Object model;
    public Function onModelChange;
    public Function onModelTouched;
    public Boolean checked;
    public Boolean hover;
    native public void onclick();
    native public void onMouseEnter();
    native public void onMouseLeave();
    native public void writeValue(Object model);
    native public void registerOnChange(Function fn);
    native public void registerOnTouched(Function fn);
}

