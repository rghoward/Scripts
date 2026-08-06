package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.intercom.android.sdk.m5.preview.ui.MediaPickerButtonKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ze implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ di4 u;

    public /* synthetic */ ze(di4 di4Var, int i) {
        this.t = i;
        this.u = di4Var;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        di4 di4Var = this.u;
        switch (i) {
            case 0:
                final ya yaVar = (ya) obj;
                yaVar.getClass();
                ConstraintLayout constraintLayout = ((m96) yaVar.u).a;
                constraintLayout.getClass();
                xgb.a(constraintLayout, new df((qf.c) di4Var, yaVar, null));
                yaVar.s(new oh4() { // from class: af
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj2) {
                        ((List) obj2).getClass();
                        ya yaVar2 = yaVar;
                        m96 m96Var = (m96) yaVar2.u;
                        m96Var.d.setText(((fh) yaVar2.t()).b);
                        m96Var.c.setText(((fh) yaVar2.t()).c);
                        m96Var.b.setChecked(((fh) yaVar2.t()).d);
                        return g2b.a;
                    }
                });
                return g2b.a;
            default:
                return MediaPickerButtonKt.MediaPickerButton$lambda$3$lambda$2((oh4) di4Var, (List) obj);
        }
    }
}
