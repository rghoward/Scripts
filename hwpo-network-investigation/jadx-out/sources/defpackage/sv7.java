package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sv7 implements ci4 {
    public final /* synthetic */ int t;

    public /* synthetic */ sv7(int i) {
        this.t = i;
    }

    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup.getClass();
                ia6 ia6VarInflate = ia6.inflate(layoutInflater, viewGroup, false);
                ia6VarInflate.getClass();
                return ia6VarInflate;
            default:
                oha ohaVar = (oha) obj2;
                return ws0.c(Float.valueOf(ohaVar.a), Float.valueOf(ohaVar.b));
        }
    }
}
