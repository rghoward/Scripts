package defpackage;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.radiobutton.MaterialRadioButton;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class a9b implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ a9b(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                ((FloatingActionButton) obj2).setEnabled(((Boolean) obj).booleanValue());
                break;
            default:
                yp4 yp4Var = (yp4) obj;
                nsb.a aVar = nsb.Companion;
                yg4 yg4VarP = ((nsb) obj2).p();
                yg4VarP.f.setChecked(false);
                MaterialRadioButton materialRadioButton = yg4VarP.j;
                materialRadioButton.setChecked(false);
                MaterialRadioButton materialRadioButton2 = yg4VarP.c;
                materialRadioButton2.setChecked(false);
                if (xj5.a(yp4Var, yp4.b.t)) {
                    yg4VarP.f.setChecked(true);
                } else if (xj5.a(yp4Var, yp4.c.t)) {
                    materialRadioButton.setChecked(true);
                } else if (yp4Var instanceof yp4.a) {
                    materialRadioButton2.setChecked(true);
                }
                break;
        }
        return g2b.a;
    }
}
