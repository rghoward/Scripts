package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dg implements ci4 {
    public final /* synthetic */ int t;

    public /* synthetic */ dg(int i) {
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
                es5 es5VarInflate = es5.inflate(layoutInflater, viewGroup, false);
                es5VarInflate.getClass();
                return es5VarInflate;
            case 1:
                LayoutInflater layoutInflater2 = (LayoutInflater) obj;
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                layoutInflater2.getClass();
                viewGroup2.getClass();
                t96 t96VarInflate = t96.inflate(layoutInflater2, viewGroup2, false);
                t96VarInflate.getClass();
                return t96VarInflate;
            default:
                lja ljaVar = (lja) obj2;
                return ws0.c(Integer.valueOf((int) (ljaVar.a >> 32)), Integer.valueOf((int) (ljaVar.a & 4294967295L)));
        }
    }
}
