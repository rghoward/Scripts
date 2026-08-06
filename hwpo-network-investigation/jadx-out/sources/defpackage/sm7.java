package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sm7 implements ci4 {
    public final /* synthetic */ int t;

    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return Integer.valueOf(((pj5) obj).c0(((Integer) obj2).intValue()));
            default:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup.getClass();
                es5 es5VarInflate = es5.inflate(layoutInflater, viewGroup, false);
                es5VarInflate.getClass();
                return es5VarInflate;
        }
    }
}
