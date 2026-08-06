package defpackage;

import android.net.Uri;
import com.intercom.twig.BuildConfig;
import j$.time.LocalDate;
import java.io.File;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e8 extends dl0<p8, b5> {
    public static final a Companion = new a();
    public final xj4 A;
    public final s3b B;
    public final gx2 C;
    public final bx2 D;
    public final rd6 E;
    public final bu8 F;
    public final cm3 G;
    public File H;
    public Uri I;
    public final yq6 J;
    public final yq6 K;
    public final yq6 L;
    public final yq6 M;
    public final yq6 N;
    public final yq6 O;
    public final yq6 P;
    public final yq6 Q;
    public final yq6 R;
    public final yq6 S;
    public final g6 x;
    public final u3b y;
    public final rk4 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(g6 g6Var, u3b u3bVar, rk4 rk4Var, xj4 xj4Var, s3b s3bVar, ze7 ze7Var, gx2 gx2Var, bx2 bx2Var, rd6 rd6Var, bu8 bu8Var, cm3 cm3Var) {
        super(p8.k);
        g6Var.getClass();
        u3bVar.getClass();
        rk4Var.getClass();
        xj4Var.getClass();
        s3bVar.getClass();
        ze7Var.getClass();
        gx2Var.getClass();
        bx2Var.getClass();
        rd6Var.getClass();
        bu8Var.getClass();
        cm3Var.getClass();
        p8.Companion.getClass();
        this.x = g6Var;
        this.y = u3bVar;
        this.z = rk4Var;
        this.A = xj4Var;
        this.B = s3bVar;
        this.C = gx2Var;
        this.D = bx2Var;
        this.E = rd6Var;
        this.F = bu8Var;
        this.G = cm3Var;
        this.J = oh7.a(this.u, new u7(0));
        this.K = oh7.a(this.u, new v7(0));
        this.L = oh7.a(this.u, new w7(0));
        this.M = oh7.a(this.u, new x7());
        this.N = oh7.a(this.u, new y7());
        this.O = oh7.a(this.u, new z7());
        this.P = oh7.a(this.u, new a8(0));
        this.Q = oh7.a(this.u, new b8(0));
        this.R = oh7.a(this.u, new c8(0, this));
        this.S = oh7.a(this.u, new d8(0));
        yk2.o(new k74(ze7Var.b(g2b.a), new f8(this, null)), rhb.b(this));
    }

    public static final void g(e8 e8Var, Exception exc) {
        e8Var.getClass();
        rma.a.b(exc);
        e8Var.f(new i5.g(e8Var.G.a(exc)));
    }

    public static Object i(e8 e8Var, String str, String str2, String str3, LocalDate localDate, p6a p6aVar, int i) {
        String str4 = (i & 1) != 0 ? null : str;
        String str5 = (i & 2) != 0 ? null : str2;
        String str6 = (i & 4) != 0 ? null : str3;
        LocalDate localDate2 = (i & 8) != 0 ? null : localDate;
        u3b u3bVar = e8Var.y;
        u3b.a aVar = new u3b.a(str4, str5, null, str6, null, null, localDate2, null, 180);
        u3bVar.getClass();
        return g5b.b(u3bVar, aVar, p6aVar);
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        String strValueOf;
        bl0Var.getClass();
        if (bl0Var instanceof b5.b) {
            return p8.a(b(), true, null, null, null, null, 1022);
        }
        if (bl0Var instanceof b5.a) {
            return p8.a(b(), false, null, null, null, null, 1022);
        }
        if (!(bl0Var instanceof b5.g)) {
            if (bl0Var instanceof b5.e) {
                b5.e eVar = (b5.e) bl0Var;
                return p8.a(b(), false, eVar.a, eVar.b, null, null, 1013);
            }
            if (bl0Var instanceof b5.f) {
                b();
                throw null;
            }
            if (bl0Var instanceof b5.c) {
                return p8.a(b(), false, null, null, ((b5.c) bl0Var).a, null, 959);
            }
            return bl0Var instanceof b5.d ? p8.a(b(), false, null, null, null, ((b5.d) bl0Var).a, 895) : b();
        }
        b();
        h5b h5bVar = ((b5.g) bl0Var).a;
        String str = h5bVar.c;
        String str2 = h5bVar.f;
        String str3 = h5bVar.d;
        String str4 = (str == null || (strValueOf = String.valueOf(a3a.S(str))) == null || !(str2 == null || z2a.w(str2))) ? null : strValueOf;
        boolean z = str2 != null;
        LocalDate localDate = h5bVar.h;
        String str5 = h5bVar.i;
        str5.getClass();
        String displayCountry = new Locale(BuildConfig.FLAVOR, str5).getDisplayCountry();
        displayCountry.getClass();
        l5b l5bVar = new l5b(str5, displayCountry);
        yp4 yp4Var = h5bVar.j;
        String str6 = h5bVar.e;
        p8.a aVar = p8.Companion;
        str6.getClass();
        return new p8(false, str, str3, str4, str2, z, localDate, l5bVar, yp4Var, str6);
    }

    @Override // defpackage.mhb
    public final void onCleared() {
        super.onCleared();
        File file = this.H;
        if (file != null) {
            file.delete();
        }
    }
}
