package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ad7 implements ci4 {
    public final /* synthetic */ int t;

    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup.getClass();
                ga6 ga6VarInflate = ga6.inflate(layoutInflater, viewGroup, false);
                ga6VarInflate.getClass();
                return ga6VarInflate;
            default:
                long j = ((dka) obj2).a;
                if (dka.a(j, 8589934592L)) {
                    return 0;
                }
                if (dka.a(j, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
        }
    }
}
