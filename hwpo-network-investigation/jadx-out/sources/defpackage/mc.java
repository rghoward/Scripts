package defpackage;

import android.widget.CompoundButton;
import com.google.android.material.radiobutton.MaterialRadioButton;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mc implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ mc(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                final xb.b bVar = (xb.b) obj2;
                final ya yaVar = (ya) obj;
                yaVar.getClass();
                yaVar.s(new oh4() { // from class: nc
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj3) {
                        ((List) obj3).getClass();
                        final ya yaVar2 = yaVar;
                        sa6 sa6Var = (sa6) yaVar2.u;
                        sa6Var.c.setText(((rc) yaVar2.t()).b);
                        MaterialRadioButton materialRadioButton = sa6Var.b;
                        materialRadioButton.setChecked(((rc) yaVar2.t()).c);
                        final xb.b bVar2 = bVar;
                        materialRadioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: oc
                            @Override // android.widget.CompoundButton.OnCheckedChangeListener
                            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                                compoundButton.getClass();
                                bVar2.invoke(Integer.valueOf(((rc) yaVar2.t()).a), Boolean.valueOf(z));
                            }
                        });
                        return g2b.a;
                    }
                });
                break;
            default:
                ic4 ic4Var = (ic4) obj2;
                gm3 gm3Var = (gm3) obj;
                ic4.a aVar = ic4.Companion;
                gm3Var.getClass();
                if (gm3Var instanceof mc4.b) {
                    ic4Var.t(((mc4.b) gm3Var).b);
                } else if (gm3Var instanceof mc4.a) {
                    ic4Var.getParentFragmentManager().e0(uy0.c(new js7("ARG_MESSAGE", ((mc4.a) gm3Var).b)), "REQUEST_KEY_FORGOT_PASSWORD_DIALOG");
                    ic4Var.i();
                }
                break;
        }
        return g2b.a;
    }
}
