package defpackage;

import com.hwpo_training_app.core.widget.PickedOptionTextView;
import com.hwpo_training_app.core.widget.SimpleProgressBar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oe extends y27 {
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oe(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i);
        this.u = i2;
    }

    public final void f(Object obj) {
        switch (this.u) {
            case 0:
                ((PickedOptionTextView) this.receiver).setPickedOptionText((String) obj);
                break;
            default:
                ((SimpleProgressBar) this.receiver).setVisible(((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // defpackage.eo5
    public final Object get() {
        switch (this.u) {
            case 0:
                return ((PickedOptionTextView) this.receiver).getPickedOptionText();
            default:
                return Boolean.valueOf(((SimpleProgressBar) this.receiver).t);
        }
    }
}
