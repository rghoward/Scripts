package defpackage;

import com.hwpo_training_app.R;
import java.io.File;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class gl3 extends dl0<il3, yj3> {
    public static final /* synthetic */ int V = 0;
    public final k55 A;
    public final r60 B;
    public final mz9 C;
    public final r31 D;
    public final bu8 E;
    public final cm3 F;
    public final ebb G;
    public final int H;
    public final String I;
    public final String J;
    public final xn0 K;
    public final yq6 L;
    public final yq6 M;
    public final yq6 N;
    public final yq6 O;
    public final yq6 P;
    public final yq6 Q;
    public final yq6 R;
    public final yq6 S;
    public final DecimalFormat T;
    public final SimpleDateFormat U;
    public final pta x;
    public final pl4 y;
    public final e70 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends pi4 implements oh4<String, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(String str) {
            String str2 = str;
            str2.getClass();
            ((pta) this.receiver).u(str2);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends pi4 implements ci4<Integer, String[], g2b> {
        @Override // defpackage.ci4
        public final g2b invoke(Integer num, String[] strArr) {
            int iIntValue = num.intValue();
            String[] strArr2 = strArr;
            strArr2.getClass();
            ((pta) this.receiver).f(strArr2, iIntValue);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class c extends pi4 implements ci4<Long, String, g2b> {
        @Override // defpackage.ci4
        public final g2b invoke(Long l, String str) {
            long jLongValue = l.longValue();
            String str2 = str;
            str2.getClass();
            gl3 gl3Var = (gl3) this.receiver;
            int i = gl3.V;
            gl3Var.getClass();
            oy0.d(rhb.b(gl3Var), null, null, new bl3(jLongValue, str2, gl3Var, null), 3);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class d extends pi4 implements oh4<String, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(String str) {
            String str2 = str;
            str2.getClass();
            gl3 gl3Var = (gl3) this.receiver;
            int i = gl3.V;
            gl3Var.getClass();
            oy0.d(rhb.b(gl3Var), null, null, new al3(gl3Var, str2, null), 3);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class e extends pi4 implements ci4<File, String, g2b> {
        @Override // defpackage.ci4
        public final g2b invoke(File file, String str) {
            File file2 = file;
            String str2 = str;
            file2.getClass();
            str2.getClass();
            gl3 gl3Var = (gl3) this.receiver;
            gl3Var.A.getClass();
            gl3Var.f(new zj3(file2, str2));
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl3(q09 q09Var, pta ptaVar, pl4 pl4Var, mf7 mf7Var, e70 e70Var, k55 k55Var, r60 r60Var, mz9 mz9Var, r31 r31Var, af7 af7Var, bu8 bu8Var, cm3 cm3Var) {
        super(il3.f);
        q09Var.getClass();
        ptaVar.getClass();
        pl4Var.getClass();
        mf7Var.getClass();
        e70Var.getClass();
        k55Var.getClass();
        r60Var.getClass();
        mz9Var.getClass();
        r31Var.getClass();
        af7Var.getClass();
        bu8Var.getClass();
        cm3Var.getClass();
        il3.Companion.getClass();
        this.x = ptaVar;
        this.y = pl4Var;
        this.z = e70Var;
        this.A = k55Var;
        this.B = r60Var;
        this.C = mz9Var;
        this.D = r31Var;
        this.E = bu8Var;
        this.F = cm3Var;
        ebb ebbVar = (ebb) q09Var.a("com.fitr_training.tracking.presentation.entry_details.EntryDetailsFragment.VALUE_TYPE");
        if (ebbVar == null) {
            z90.a("VALUE_TYPE must not be null");
            throw null;
        }
        this.G = ebbVar;
        Integer num = (Integer) q09Var.a("com.fitr_training.tracking.presentation.entry_details.EntryDetailsFragment.ID");
        if (num == null) {
            z90.a("ID must not be null");
            throw null;
        }
        this.H = num.intValue();
        String str = (String) q09Var.a("com.fitr_training.tracking.presentation.entry_details.EntryDetailsFragment.NAME");
        if (str == null) {
            z90.a("NAME must not be null");
            throw null;
        }
        this.I = str;
        String str2 = (String) q09Var.a("com.fitr_training.tracking.presentation.entry_details.EntryDetailsFragment.TITLE");
        if (str2 == null) {
            z90.a("TITLE must not be null");
            throw null;
        }
        String str3 = (String) q09Var.a("com.fitr_training.tracking.presentation.entry_details.EntryDetailsFragment.DATE");
        if (str3 == null) {
            z90.a("DATE must not be null");
            throw null;
        }
        this.J = str3;
        xn0 xn0Var = (xn0) q09Var.a("com.fitr_training.tracking.presentation.entry_details.EntryDetailsFragment.MEASURE_TYPE");
        if (xn0Var == null) {
            z90.a("MEASURE_TYPE must not be null");
            throw null;
        }
        this.K = xn0Var;
        this.L = oh7.a(this.u, new wk3(0));
        this.M = oh7.a(this.u, new b60(1));
        this.N = oh7.a(this.u, new c60(1));
        this.O = oh7.a(this.u, new d60(1));
        this.P = oh7.a(this.u, new xk3(0));
        this.Q = oh7.a(this.u, new yk3(0));
        this.R = oh7.a(this.u, new zk3(0, this));
        this.S = oh7.a(this.u, new t22(1, this));
        this.T = new DecimalFormat("0.###");
        this.U = new SimpleDateFormat("d MMM, yyyy", Locale.getDefault());
        e(new yj3.b(str2, str3));
        g2b g2bVar = g2b.a;
        yk2.o(new k74(new el3(mf7Var.b(g2bVar), this), new fl3(this, null)), rhb.b(this));
        g();
        yk2.o(new k74(af7Var.b(g2bVar), new dl3(this, null)), rhb.b(this));
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (bl0Var instanceof yj3.b) {
            yj3.b bVar = (yj3.b) bl0Var;
            return il3.a(b(), bVar.a, bVar.b, false, null, null, 28);
        }
        if (bl0Var instanceof yj3.c) {
            il3 il3VarB = b();
            bu8 bu8Var = this.E;
            return il3.a(il3VarB, null, null, false, null, new vz7(0, true, true, bu8Var.b(R.string.something_went_wrong, new Object[0]), bu8Var.b(R.string.no_internet_description, new Object[0]), bu8Var.b(R.string.reload, new Object[0]), 65), 15);
        }
        if (bl0Var instanceof yj3.d) {
            return il3.a(b(), null, null, true, null, null, 27);
        }
        if (bl0Var instanceof yj3.e) {
            return il3.a(b(), null, null, false, null, null, 27);
        }
        if (!(bl0Var instanceof yj3.a)) {
            return b();
        }
        return il3.a(b(), null, null, false, ((yj3.a) bl0Var).a, vz7.a(b().e), 7);
    }

    public final dz9 g() {
        return oy0.d(rhb.b(this), null, null, new cl3(this, null), 3);
    }

    public final void i(l89 l89Var) {
        l89Var.getClass();
        xj3 xj3Var = b().d;
        if (xj3Var != null) {
            List<m89> list = xj3Var.h;
            this.z.getClass();
            ArrayList arrayListB = e70.b(list);
            ArrayList arrayList = new ArrayList();
            int size = arrayListB.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListB.get(i);
                i++;
                if (((l89) obj).v == u60.u) {
                    arrayList.add(obj);
                }
            }
            pta ptaVar = this.x;
            a aVar = new a(1, ptaVar, pta.class, "goToPhotoPreview", "goToPhotoPreview(Ljava/lang/String;)V", 0);
            b bVar = new b(2, ptaVar, pta.class, "goToVideoPlayer", "goToVideoPlayer(I[Ljava/lang/String;)V", 0);
            this.B.a(l89Var, arrayList, aVar, new vk3(0, this), new c(2, this, gl3.class, "downloadFile", "downloadFile(JLjava/lang/String;)V", 0), new d(1, this, gl3.class, "cancelFileDownload", "cancelFileDownload(Ljava/lang/String;)V", 0), bVar, new e(2, this, gl3.class, "openFile", "openFile(Ljava/io/File;Ljava/lang/String;)V", 0));
        }
    }
}
