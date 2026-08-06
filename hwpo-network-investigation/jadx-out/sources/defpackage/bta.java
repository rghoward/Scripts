package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.i;
import com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderFragment;
import com.intercom.twig.BuildConfig;
import j$.time.LocalDate;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class bta implements pta, eta, tp6 {
    public final hy8 a;
    public final eta b;
    public final tp6 c;

    public bta(hy8 hy8Var, eta etaVar, tp6 tp6Var) {
        hy8Var.getClass();
        etaVar.getClass();
        tp6Var.getClass();
        this.a = hy8Var;
        this.b = etaVar;
        this.c = tp6Var;
    }

    @Override // defpackage.pta
    public final void a() {
        this.a.b();
    }

    @Override // defpackage.pta
    public final void c(final int i, final int i2, final tc8 tc8Var, final zc8 zc8Var, final String str) {
        str.getClass();
        this.a.c(new rf4(rb3.class.getName(), new mb2() { // from class: ata
            @Override // defpackage.mb2
            public final Object c(i iVar) {
                iVar.getClass();
                rb3.Companion.getClass();
                return rb3.a.a(i, i2, false, tc8Var, zc8Var, false, str);
            }
        }, true));
    }

    @Override // defpackage.pta
    public final void e(int i, String str, int i2, int i3, int i4, final boolean z) {
        str.getClass();
        xn0 xn0Var = (xn0) xn0.J.get(i3);
        final ebb ebbVar = (ebb) ebb.y.get(i4);
        final vn0 vn0Var = new vn0(i, str, 0.0d, null, BuildConfig.FLAVOR, (m2b) m2b.I.get(i2), xn0Var, true);
        this.a.c(new rf4(fi3.class.getName(), new mb2() { // from class: ysa
            @Override // defpackage.mb2
            public final Object c(i iVar) {
                iVar.getClass();
                fi3.Companion.getClass();
                return fi3.a.a(ebbVar, z, null, null, null, vn0Var, hf3.t);
            }
        }, true));
    }

    @Override // defpackage.tp6
    public final void f(String[] strArr, int i) {
        strArr.getClass();
        this.c.f(strArr, i);
    }

    @Override // defpackage.pta
    public final void g(final String str, final String str2, final int i, final String str3, final int i2, final int i3) {
        str.getClass();
        str2.getClass();
        this.a.c(new rf4(gk3.class.getName(), new mb2() { // from class: vsa
            @Override // defpackage.mb2
            public final Object c(i iVar) {
                iVar.getClass();
                gk3.a aVar = gk3.Companion;
                ebb ebbVar = (ebb) ebb.y.get(i);
                xn0 xn0Var = (xn0) xn0.J.get(i3);
                aVar.getClass();
                ebbVar.getClass();
                String str4 = str2;
                str4.getClass();
                String str5 = str;
                str5.getClass();
                xn0Var.getClass();
                gk3 gk3Var = new gk3();
                Bundle bundle = new Bundle();
                bundle.putSerializable("com.fitr_training.tracking.presentation.entry_details.EntryDetailsFragment.VALUE_TYPE", ebbVar);
                bundle.putInt("com.fitr_training.tracking.presentation.entry_details.EntryDetailsFragment.ID", i2);
                bundle.putSerializable("com.fitr_training.tracking.presentation.entry_details.EntryDetailsFragment.MEASURE_TYPE", xn0Var);
                bundle.putString("com.fitr_training.tracking.presentation.entry_details.EntryDetailsFragment.NAME", str4);
                bundle.putString("com.fitr_training.tracking.presentation.entry_details.EntryDetailsFragment.DATE", str3);
                bundle.putString("com.fitr_training.tracking.presentation.entry_details.EntryDetailsFragment.TITLE", str5);
                gk3Var.setArguments(bundle);
                return gk3Var;
            }
        }, true));
    }

    @Override // defpackage.pta
    public final void h(final int i, final int i2, final vn0 vn0Var, final String str, final LocalDate localDate, final ArrayList arrayList) {
        this.a.c(new rf4(fi3.class.getName(), new mb2() { // from class: zsa
            @Override // defpackage.mb2
            public final Object c(i iVar) {
                iVar.getClass();
                fi3.a aVar = fi3.Companion;
                ebb ebbVar = (ebb) ebb.y.get(i);
                ArrayList arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(ph1.n(arrayList2, 10));
                int size = arrayList2.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList2.get(i3);
                    i3++;
                    Parcelable parcelable = (Parcelable) obj;
                    parcelable.getClass();
                    arrayList3.add((l89) parcelable);
                }
                Integer numValueOf = Integer.valueOf(i2);
                aVar.getClass();
                return fi3.a.a(ebbVar, true, numValueOf, localDate, str, vn0Var, arrayList3);
            }
        }, true));
    }

    @Override // defpackage.pta
    public final void i(final String str, final String str2, final String str3, final int i) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a.c(new rf4(LeaderboardDetailsHeaderFragment.class.getName(), new mb2() { // from class: xsa
            @Override // defpackage.mb2
            public final Object c(i iVar) {
                iVar.getClass();
                LeaderboardDetailsHeaderFragment.Companion.getClass();
                return LeaderboardDetailsHeaderFragment.Companion.a(i, str, str2, str3, false);
            }
        }, true));
    }

    @Override // defpackage.eta
    public final void l(int i, int i2, int i3, int i4, String str) {
        str.getClass();
        this.b.l(i, i2, i3, i4, str);
    }

    @Override // defpackage.pta
    public final void m() {
        rf4 rf4Var = new rf4(hta.class.getName(), new wu8(), true);
        hy8 hy8Var = this.a;
        hy8Var.getClass();
        hy8Var.a(new xh0(rf4Var));
    }

    @Override // defpackage.pta
    public final void r(int i, String str, String str2) {
        str.getClass();
        this.a.c(new rf4(t61.class.getName(), new kp3(i, str, str2), true));
    }

    @Override // defpackage.tp6
    public final void u(String str) {
        str.getClass();
        this.c.u(str);
    }

    @Override // defpackage.pta
    public final void v() {
        this.a.c(new rf4(xb.class.getName(), new wsa(), true));
    }
}
