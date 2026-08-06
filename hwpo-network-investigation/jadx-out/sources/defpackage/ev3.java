package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ev3 implements ci4 {
    public final /* synthetic */ int t;

    public /* synthetic */ ev3(int i) {
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
                aa6 aa6VarInflate = aa6.inflate(layoutInflater, viewGroup, false);
                aa6VarInflate.getClass();
                return aa6VarInflate;
            default:
                k19 k19Var = (k19) obj;
                el9 el9Var = (el9) obj2;
                return ws0.c(t29.a(new uh1(el9Var.a), t29.r, k19Var), t29.a(new vf7(el9Var.b), t29.z, k19Var), Float.valueOf(el9Var.c));
        }
    }
}
