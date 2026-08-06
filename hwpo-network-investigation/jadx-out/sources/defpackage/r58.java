package defpackage;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.hwpo_training_app.R;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r58 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ r58(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                s58 s58Var = (s58) obj2;
                td1 td1Var = (td1) obj;
                td1Var.getClass();
                td1.a(td1Var, "type", o2a.b);
                td1.a(td1Var, "value", od9.c("kotlinx.serialization.Polymorphic<" + s58Var.a.c() + '>', pd9.a.a, new SerialDescriptor[0]));
                hf3 hf3Var = s58Var.b;
                hf3Var.getClass();
                td1Var.b = hf3Var;
                return g2b.a;
            case 1:
                Float f = (Float) obj;
                f.getClass();
                return Float.valueOf(((Number) ((oh4) ((h37) obj2).getValue()).invoke(f)).floatValue());
            case 2:
                opa opaVar = (opa) obj2;
                gm3 gm3Var = (gm3) obj;
                opa.a aVar = opa.Companion;
                gm3Var.getClass();
                if (gm3Var instanceof xpa) {
                    Context contextRequireContext = opaVar.requireContext();
                    contextRequireContext.getClass();
                    yz1.a(contextRequireContext, null);
                } else if (gm3Var instanceof atb) {
                    btb.a aVar2 = btb.Companion;
                    String str = ((atb) gm3Var).b;
                    aVar2.getClass();
                    hk0.l(opaVar, btb.a.a(str));
                }
                return g2b.a;
            default:
                final ya yaVar = (ya) obj;
                yaVar.getClass();
                da6 da6Var = (da6) yaVar.u;
                LinearLayout linearLayout = da6Var.a;
                linearLayout.getClass();
                xgb.a(linearLayout, new zsb((vo6.c) obj2, yaVar, null));
                final hr5 hr5VarBind = hr5.bind(da6Var.a);
                hr5VarBind.getClass();
                yaVar.s(new oh4() { // from class: wsb
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj3) {
                        ((List) obj3).getClass();
                        ya yaVar2 = yaVar;
                        ((da6) yaVar2.u).b.setText(((x60.d) yaVar2.t()).b);
                        hr5 hr5Var = hr5VarBind;
                        e85.b(hr5Var.b, ((x60.d) yaVar2.t()).e, R.drawable.placeholder_video_attachment, true);
                        ImageView imageView = hr5Var.e;
                        imageView.setVisibility(0);
                        imageView.setImageResource(R.drawable.ic_youtube_badge);
                        hr5Var.c.setVisibility(((x60.d) yaVar2.t()).c ? 0 : 8);
                        hr5Var.d.setVisibility(((x60.d) yaVar2.t()).c ? 0 : 8);
                        return g2b.a;
                    }
                });
                return g2b.a;
        }
    }
}
