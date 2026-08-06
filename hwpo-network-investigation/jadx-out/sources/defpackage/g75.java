package defpackage;

import android.widget.LinearLayout;
import com.hwpo_training_app.R;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g75 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ g75(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                final ya yaVar = (ya) obj;
                yaVar.getClass();
                ba6 ba6Var = (ba6) yaVar.u;
                LinearLayout linearLayout = ba6Var.a;
                linearLayout.getClass();
                xgb.a(linearLayout, new k75((vo6.c) obj2, yaVar, null));
                final hr5 hr5VarBind = hr5.bind(ba6Var.c.a);
                hr5VarBind.getClass();
                yaVar.s(new oh4() { // from class: h75
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj3) {
                        ((List) obj3).getClass();
                        ya yaVar2 = yaVar;
                        ((ba6) yaVar2.u).b.setText(((x60.b) yaVar2.t()).b);
                        hr5 hr5Var = hr5VarBind;
                        e85.b(hr5Var.b, ((x60.b) yaVar2.t()).e, R.drawable.placeholder_image_attachment, true);
                        hr5Var.c.setVisibility(((x60.b) yaVar2.t()).c ? 0 : 8);
                        hr5Var.d.setVisibility(((x60.b) yaVar2.t()).c ? 0 : 8);
                        return g2b.a;
                    }
                });
                break;
            default:
                u56 u56Var = (u56) obj2;
                dt7 dt7Var = u56Var.t;
                kha khaVar = (kha) obj;
                String str = khaVar.a.u;
                iw iwVar = u56Var.j;
                if (!xj5.a(str, iwVar != null ? iwVar.u : null)) {
                    u56Var.k.setValue(bt4.t);
                    if (((Boolean) dt7Var.getValue()).booleanValue()) {
                        dt7Var.setValue(Boolean.FALSE);
                    } else {
                        u56Var.s.setValue(Boolean.FALSE);
                    }
                }
                long j = lja.b;
                u56Var.f(j);
                u56Var.e(j);
                u56Var.u.invoke(khaVar);
                u56Var.b.invalidate();
                break;
        }
        return g2b.a;
    }
}
