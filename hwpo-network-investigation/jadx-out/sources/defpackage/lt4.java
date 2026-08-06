package defpackage;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lt4 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ lt4(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                try {
                    return (List) ((mh4) obj).invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return hf3.t;
                }
            case 1:
                to8.a aVar = to8.Companion;
                to8.b bVar = new to8.b(1, ((to8) obj).p(), gp8.class, "onReasonClicked", "onReasonClicked(Lcom/hwpo_training_app/report/domain/entity/ReportReason;)V", 0);
                qo8 qo8Var = new qo8(new qo8.a());
                qo8Var.d.b(new e93(new ko8(), new lo8(3), new b32(1, bVar), mo8.u));
                return qo8Var;
            default:
                ((ms9) obj).dismiss();
                return g2b.a;
        }
    }
}
