package defpackage;

import android.content.ContentResolver;
import com.hwpo_training_app.R;
import com.intercom.twig.BuildConfig;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pc3 extends dl0<c, a> {
    public static final b Companion = new b();
    public final hl4 A;
    public final zz8 B;
    public final ee1 C;
    public final fp1 D;
    public final e70 E;
    public final t1b F;
    public final n89 G;
    public final p43 H;
    public final oz9 I;
    public final s31 J;
    public final ov8 K;
    public final bu8 L;
    public final ContentResolver M;
    public final cm3 N;
    public final yq6 O;
    public final yq6 P;
    public final yq6 Q;
    public final yq6 R;
    public final yq6 S;
    public final yq6 T;
    public final yq6 U;
    public final yq6 V;
    public final yq6 W;
    public final yq6 X;
    public final yq6 Y;
    public final int x;
    public final int y;
    public final hy8 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class a implements bl0 {

        /* JADX INFO: renamed from: pc3$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0219a extends a {
            public final l89 a;

            public C0219a(l89 l89Var) {
                this.a = l89Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0219a) && this.a.equals(((C0219a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "AddAttachmentToList(sectionAttachment=" + this.a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class b extends a {
            public final String a;

            public b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a.equals(((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return sk0.c("ChangeTitle(title=", this.a, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class c extends a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 710544338;
            }

            public final String toString() {
                return "FinishLoading";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class d extends a {
            public final String a;

            public d(String str) {
                str.getClass();
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && xj5.a(this.a, ((d) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return sk0.c("NotesTextChanged(text=", this.a, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class e extends a {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -444481230;
            }

            public final String toString() {
                return "PerformanceCompleted";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class f extends a {
            public static final f a = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 613347577;
            }

            public final String toString() {
                return "PerformanceUncompleted";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class g extends a {
            public final long a;

            public g(long j) {
                this.a = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && this.a == ((g) obj).a;
            }

            public final int hashCode() {
                return Long.hashCode(this.a);
            }

            public final String toString() {
                return "RemoveAttachmentFromList(attachmentId=" + this.a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class h extends a {
            public final String a;

            public h(String str) {
                str.getClass();
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && xj5.a(this.a, ((h) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return sk0.c("RemoveUploadingAttachmentFromList(filePath=", this.a, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class i extends a {
            public final zc8 a;

            public i(zc8 zc8Var) {
                this.a = zc8Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && this.a.equals(((i) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "ScoreDataChanged(score=" + this.a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class j extends a {
            public final zc8 a;
            public final tc8 b;

            public j(tc8 tc8Var, zc8 zc8Var) {
                this.a = zc8Var;
                this.b = tc8Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return this.a.equals(jVar.a) && this.b.equals(jVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "SectionDetailsLoaded(programScore=" + this.a + ", performance=" + this.b + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class k extends a {
            public static final k a = new k();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof k);
            }

            public final int hashCode() {
                return 1107300017;
            }

            public final String toString() {
                return "StartLoading";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class l extends a {
            public final ArrayList a;

            public l(ArrayList arrayList) {
                this.a = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof l) && this.a.equals(((l) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ml.a("UpdateAttachments(sectionAttachments=", this.a, ")");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements el0 {
        public final tc8 a;
        public final zc8 b;
        public final tc8 c;
        public final zc8 d;
        public final Integer e;
        public final String f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        public final boolean j;
        public final boolean k;

        public c(tc8 tc8Var, zc8 zc8Var, tc8 tc8Var2, zc8 zc8Var2, Integer num, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.a = tc8Var;
            this.b = zc8Var;
            this.c = tc8Var2;
            this.d = zc8Var2;
            this.e = num;
            this.f = str;
            this.g = z;
            this.h = z2;
            this.i = z3;
            this.j = z4;
            this.k = z5;
        }

        public static c a(c cVar, tc8 tc8Var, zc8 zc8Var, tc8 tc8Var2, zc8 zc8Var2, Integer num, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
            if ((i & 1) != 0) {
                tc8Var = cVar.a;
            }
            tc8 tc8Var3 = tc8Var;
            if ((i & 2) != 0) {
                zc8Var = cVar.b;
            }
            zc8 zc8Var3 = zc8Var;
            if ((i & 4) != 0) {
                tc8Var2 = cVar.c;
            }
            tc8 tc8Var4 = tc8Var2;
            zc8 zc8Var4 = (i & 8) != 0 ? cVar.d : zc8Var2;
            Integer num2 = (i & 16) != 0 ? cVar.e : num;
            String str2 = (i & 32) != 0 ? cVar.f : str;
            boolean z6 = (i & 64) != 0 ? cVar.g : z;
            boolean z7 = (i & 128) != 0 ? cVar.h : z2;
            cVar.getClass();
            boolean z8 = (i & 512) != 0 ? cVar.i : z3;
            boolean z9 = (i & 1024) != 0 ? cVar.j : z4;
            boolean z10 = (i & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? cVar.k : z5;
            cVar.getClass();
            return new c(tc8Var3, zc8Var3, tc8Var4, zc8Var4, num2, str2, z6, z7, z8, z9, z10);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && this.b.equals(cVar.b) && this.c.equals(cVar.c) && this.d.equals(cVar.d) && xj5.a(this.e, cVar.e) && this.f.equals(cVar.f) && this.g == cVar.g && this.h == cVar.h && this.i == cVar.i && this.j == cVar.j && this.k == cVar.k;
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
            Integer num = this.e;
            return Boolean.hashCode(this.k) + uo2.a(uo2.a(uo2.a(uo2.a(uo2.a(ru3.c((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f), this.g, 31), this.h, 31), false, 31), this.i, 31), this.j, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(initPerformance=");
            sb.append(this.a);
            sb.append(", initScore=");
            sb.append(this.b);
            sb.append(", enteredPerformance=");
            sb.append(this.c);
            sb.append(", enteredScore=");
            sb.append(this.d);
            sb.append(", actionImageResource=");
            sb.append(this.e);
            sb.append(", title=");
            sb.append(this.f);
            sb.append(", isProgress=");
            e4.a(sb, this.g, ", isSaveBtnEnabled=", this.h, ", isTimeCapMissed=false, isLinkNotesCheckBoxVisible=");
            e4.a(sb, this.i, ", isLinkMediaCheckBoxVisible=", this.j, ", isPerformanceCompleted=");
            return fz.c(sb, this.k, ")");
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x008b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0112  */
    /* JADX WARN: Illegal instructions before constructor call */
    public pc3(boolean z, tc8 tc8Var, zc8 zc8Var, String str, boolean z2, int i, int i2, hy8 hy8Var, hl4 hl4Var, zz8 zz8Var, ee1 ee1Var, fp1 fp1Var, e70 e70Var, t1b t1bVar, n89 n89Var, p43 p43Var, oz9 oz9Var, s31 s31Var, ov8 ov8Var, bf7 bf7Var, bu8 bu8Var, ContentResolver contentResolver, cm3 cm3Var) {
        Integer numValueOf;
        Integer num;
        boolean z3;
        tc8Var.getClass();
        zc8Var.getClass();
        str.getClass();
        hy8Var.getClass();
        hl4Var.getClass();
        zz8Var.getClass();
        ee1Var.getClass();
        fp1Var.getClass();
        e70Var.getClass();
        t1bVar.getClass();
        n89Var.getClass();
        p43Var.getClass();
        oz9Var.getClass();
        s31Var.getClass();
        ov8Var.getClass();
        bf7Var.getClass();
        bu8Var.getClass();
        contentResolver.getClass();
        cm3Var.getClass();
        b bVar = Companion;
        boolean zB = yx.b(tc8Var);
        boolean z4 = zc8Var.B;
        bVar.getClass();
        if (zB || z4) {
            numValueOf = Integer.valueOf(R.drawable.ic_clear_performance);
        } else {
            if (!z2) {
                if (z) {
                    num = null;
                } else {
                    numValueOf = Integer.valueOf(R.drawable.ic_benchmarks_empty);
                }
                int i3 = 1;
                if (cy.b(zc8Var) || tc8Var.v.isEmpty() || !tc8Var.w.isEmpty()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                super(new c(tc8Var, zc8Var, tc8Var, zc8Var, num, BuildConfig.FLAVOR, false, false, false, z3, z2));
                this.x = i;
                this.y = i2;
                this.z = hy8Var;
                this.A = hl4Var;
                this.B = zz8Var;
                this.C = ee1Var;
                this.D = fp1Var;
                this.E = e70Var;
                this.F = t1bVar;
                this.G = n89Var;
                this.H = p43Var;
                this.I = oz9Var;
                this.J = s31Var;
                this.K = ov8Var;
                this.L = bu8Var;
                this.M = contentResolver;
                this.N = cm3Var;
                e(new a.b(str));
                yk2.o(new k74(new j74(new ad3(bf7Var.b(g2b.a))), new bd3(this, null)), rhb.b(this));
                if (z) {
                    oy0.d(rhb.b(this), null, null, new cd3(this, null), 3);
                }
                this.O = oh7.a(this.u, new hc3(0));
                this.P = oh7.a(this.u, new mk0(i3));
                this.Q = oh7.a(this.u, new ic3(0));
                this.R = oh7.a(this.u, new jc3());
                this.S = oh7.a(this.u, new kc3());
                this.T = oh7.a(this.u, new lc3());
                this.U = oh7.a(this.u, new mc3(0));
                this.V = oh7.a(this.u, new nc3());
                this.W = oh7.a(this.u, new oc3());
                this.X = oh7.a(this.u, new se(2));
                this.Y = oh7.a(this.u, new te(2));
            }
            numValueOf = Integer.valueOf(R.drawable.ic_benchmarks_full);
        }
        num = numValueOf;
        int i4 = 1;
        if (cy.b(zc8Var)) {
            z3 = false;
        } else {
            z3 = false;
        }
        super(new c(tc8Var, zc8Var, tc8Var, zc8Var, num, BuildConfig.FLAVOR, false, false, false, z3, z2));
        this.x = i;
        this.y = i2;
        this.z = hy8Var;
        this.A = hl4Var;
        this.B = zz8Var;
        this.C = ee1Var;
        this.D = fp1Var;
        this.E = e70Var;
        this.F = t1bVar;
        this.G = n89Var;
        this.H = p43Var;
        this.I = oz9Var;
        this.J = s31Var;
        this.K = ov8Var;
        this.L = bu8Var;
        this.M = contentResolver;
        this.N = cm3Var;
        e(new a.b(str));
        yk2.o(new k74(new j74(new ad3(bf7Var.b(g2b.a))), new bd3(this, null)), rhb.b(this));
        if (z) {
            oy0.d(rhb.b(this), null, null, new cd3(this, null), 3);
        }
        this.O = oh7.a(this.u, new hc3(0));
        this.P = oh7.a(this.u, new mk0(i4));
        this.Q = oh7.a(this.u, new ic3(0));
        this.R = oh7.a(this.u, new jc3());
        this.S = oh7.a(this.u, new kc3());
        this.T = oh7.a(this.u, new lc3());
        this.U = oh7.a(this.u, new mc3(0));
        this.V = oh7.a(this.u, new nc3());
        this.W = oh7.a(this.u, new oc3());
        this.X = oh7.a(this.u, new se(2));
        this.Y = oh7.a(this.u, new te(2));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x014c, code lost:
    
        if (defpackage.yd3.a(r12, r0, r7) == r9) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(defpackage.pc3 r21, java.util.List r22, boolean r23, defpackage.u02 r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pc3.g(pc3, java.util.List, boolean, u02):java.lang.Object");
    }

    public static boolean j(tc8 tc8Var, zc8 zc8Var) {
        List<dd8> list;
        List<l89> list2 = tc8Var.v;
        if (list2 == null || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((l89) it.next()).E != z60.w) {
                    return false;
                }
            }
        }
        dd8 dd8Var = zc8Var.z;
        int iOrdinal = zc8Var.C.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                int i = zc8Var.v;
                int i2 = dd8Var.y;
                String str = dd8Var.v;
                int i3 = dd8Var.x;
                if (i2 == -1 && i3 == -1) {
                    boolean zW = z2a.w(str);
                    if (!zW && str.length() < 5) {
                        return false;
                    }
                    if (!zW && wn0.d(str) > zc8Var.A) {
                        return false;
                    }
                } else {
                    int i4 = zc8Var.w;
                    if (i4 == 0) {
                        if (i2 >= i) {
                            return false;
                        }
                    } else {
                        if (i3 >= i4) {
                            return false;
                        }
                        if ((i3 == i4 - 1 && i2 == i) || i2 > i) {
                            return false;
                        }
                    }
                }
            } else if (iOrdinal == 5 && ((list = dd8Var.w) == null || !list.isEmpty())) {
                for (dd8 dd8Var2 : list) {
                    if (!z2a.w(dd8Var2.v) && dd8Var2.v.length() < 5) {
                        return false;
                    }
                }
            }
        } else if (z2a.w(dd8Var.v) || dd8Var.v.length() != 5) {
            return false;
        }
        return true;
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (bl0Var instanceof a.k) {
            return c.a(b(), null, null, null, null, null, null, true, false, false, false, false, 4031);
        }
        if (bl0Var instanceof a.c) {
            return c.a(b(), null, null, null, null, null, null, false, false, false, false, false, 4031);
        }
        if (bl0Var instanceof a.b) {
            return c.a(b(), null, null, null, null, null, ((a.b) bl0Var).a, false, false, false, false, false, 4063);
        }
        if (bl0Var instanceof a.d) {
            c cVarB = b();
            String str = ((a.d) bl0Var).a;
            tc8 tc8VarA = tc8.a(cVarB.c, str, null, 13);
            return c.a(cVarB, null, null, tc8VarA, null, null, null, false, j(tc8VarA, b().d), cy.b(b().b) && !z2a.w(str), false, false, 3451);
        }
        if (bl0Var instanceof a.C0219a) {
            c cVarB2 = b();
            tc8 tc8Var = cVarB2.c;
            l89 l89Var = ((a.C0219a) bl0Var).a;
            ArrayList arrayListU = th1.U(tc8Var.v);
            arrayListU.add(l89Var);
            tc8 tc8VarA2 = tc8.a(tc8Var, null, th1.T(arrayListU), 11);
            return c.a(cVarB2, null, null, tc8VarA2, null, null, null, false, j(tc8VarA2, cVarB2.d), false, false, false, 3963);
        }
        if (bl0Var instanceof a.g) {
            c cVarB3 = b();
            tc8 tc8Var2 = cVarB3.c;
            long j = ((a.g) bl0Var).a;
            List<l89> list = tc8Var2.v;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((l89) obj).t != j) {
                    arrayList.add(obj);
                }
            }
            tc8 tc8VarA3 = tc8.a(tc8Var2, null, arrayList, 11);
            return c.a(cVarB3, null, null, tc8VarA3, null, null, null, false, j(tc8VarA3, cVarB3.d), false, cy.b(cVarB3.b) && !tc8VarA3.v.isEmpty() && tc8VarA3.w.isEmpty(), false, 2939);
        }
        if (bl0Var instanceof a.h) {
            c cVarB4 = b();
            tc8 tc8Var3 = cVarB4.c;
            String str2 = ((a.h) bl0Var).a;
            List<l89> list2 = tc8Var3.v;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (!xj5.a(((l89) obj2).w, str2)) {
                    arrayList2.add(obj2);
                }
            }
            tc8 tc8VarA4 = tc8.a(tc8Var3, null, arrayList2, 11);
            return c.a(cVarB4, null, null, tc8VarA4, null, null, null, false, j(tc8VarA4, cVarB4.d), false, cy.b(cVarB4.b) && !tc8VarA4.v.isEmpty() && tc8VarA4.w.isEmpty(), false, 2939);
        }
        if (bl0Var instanceof a.l) {
            tc8 tc8VarA5 = tc8.a(b().c, null, ((a.l) bl0Var).a, 11);
            return c.a(b(), null, null, tc8VarA5, null, null, null, false, j(tc8VarA5, b().d), false, cy.b(b().b) && !tc8VarA5.v.isEmpty() && tc8VarA5.w.isEmpty(), false, 2939);
        }
        if (bl0Var instanceof a.i) {
            c cVarB5 = b();
            zc8 zc8Var = ((a.i) bl0Var).a;
            return c.a(cVarB5, null, null, null, zc8Var, null, null, false, j(b().c, zc8Var), false, false, false, 3959);
        }
        if (!(bl0Var instanceof a.j)) {
            if (bl0Var instanceof a.e) {
                return c.a(b(), null, null, null, null, Integer.valueOf(R.drawable.ic_benchmarks_full), null, false, false, false, false, true, 2031);
            }
            return bl0Var instanceof a.f ? c.a(b(), null, null, null, null, Integer.valueOf(R.drawable.ic_benchmarks_empty), null, false, false, false, false, false, 2031) : b();
        }
        c cVarB6 = b();
        a.j jVar = (a.j) bl0Var;
        zc8 zc8Var2 = jVar.a;
        tc8 tc8Var4 = jVar.b;
        return c.a(cVarB6, tc8Var4, zc8Var2, tc8Var4, zc8Var2, null, null, false, false, false, false, false, 4080);
    }

    public final boolean i() {
        List<l89> list = b().c.v;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((l89) it.next()).E == z60.u) {
                return true;
            }
        }
        return false;
    }

    public final void k(Exception exc) {
        rma.a.b(exc);
        e(a.c.a);
        f(new tc3(this.N.a(exc)));
    }

    public final void l(int i, int i2, String str) {
        if (z2a.w(str) || Integer.parseInt(str) <= i2) {
            zc8 zc8VarA = b().d;
            int iOrdinal = zc8VarA.C.ordinal();
            if (iOrdinal == 2 || iOrdinal == 3) {
                zc8VarA = zc8.a(zc8VarA, dd8.a(zc8VarA.z, 0.0d, null, null, 0, z2a.w(str) ? 0 : Integer.parseInt(str), false, false, false, 991));
            } else if (iOrdinal == 6) {
                List<dd8> list = zc8VarA.z.w;
                ArrayList arrayList = new ArrayList(ph1.n(list, 10));
                for (dd8 dd8VarA : list) {
                    if (dd8VarA.z == i) {
                        dd8VarA = dd8.a(dd8VarA, 0.0d, null, null, 0, z2a.w(str) ? -1 : Integer.parseInt(str), false, false, false, 991);
                    }
                    arrayList.add(dd8VarA);
                }
                zc8VarA = zc8.a(zc8VarA, dd8.a(zc8VarA.z, 0.0d, null, arrayList, 0, 0, false, false, false, 1015));
            }
            e(new a.i(zc8VarA));
        }
    }

    public final void m(int i, int i2, String str) {
        if (z2a.w(str) || Integer.parseInt(str) <= i2) {
            zc8 zc8VarA = b().d;
            int iOrdinal = zc8VarA.C.ordinal();
            if (iOrdinal == 2 || iOrdinal == 3) {
                zc8VarA = zc8.a(zc8VarA, dd8.a(zc8VarA.z, 0.0d, null, null, z2a.w(str) ? -1 : Integer.parseInt(str), 0, false, false, false, 1007));
            } else if (iOrdinal == 6) {
                List<dd8> list = zc8VarA.z.w;
                ArrayList arrayList = new ArrayList(ph1.n(list, 10));
                for (dd8 dd8VarA : list) {
                    if (dd8VarA.z == i) {
                        dd8VarA = dd8.a(dd8VarA, 0.0d, null, null, z2a.w(str) ? -1 : Integer.parseInt(str), 0, false, false, false, 1007);
                    }
                    arrayList.add(dd8VarA);
                }
                zc8VarA = zc8.a(zc8VarA, dd8.a(zc8VarA.z, 0.0d, null, arrayList, 0, 0, false, false, false, 1015));
            }
            e(new a.i(zc8VarA));
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public final void n(int i, String str) {
        long jD;
        double d;
        String str2 = str;
        str2.getClass();
        int iOrdinal = b().b.C.ordinal();
        if (iOrdinal == 0) {
            if (str2.equals(".")) {
                return;
            }
        } else if (iOrdinal == 1) {
            if (str2.equals(":") || str2.length() > 5) {
                return;
            }
        } else if (iOrdinal != 2) {
            if (iOrdinal != 4) {
                if (iOrdinal != 5) {
                    return;
                }
                if (str2.equals(":")) {
                    return;
                } else {
                    return;
                }
            }
            if (str2.equals(".")) {
                return;
            }
        } else if (b().d.z.x == -1 && (str2.equals(":") || str2.length() > 5)) {
            return;
        }
        zc8 zc8VarA = b().d;
        v59 v59Var = zc8VarA.C;
        double d2 = -1.0d;
        if (v59Var == v59.u || v59Var == v59.y) {
            if (str2.length() == 5) {
                jD = wn0.d(str2);
                d2 = jD;
            }
        } else if (v59Var == v59.v) {
            if (str2.length() == 5) {
                jD = wn0.d(str2);
                d2 = jD;
            }
        } else if (!z2a.w(str2)) {
            d2 = Double.parseDouble(str2);
        }
        int iOrdinal2 = v59Var.ordinal();
        if (iOrdinal2 == 0 || iOrdinal2 == 1 || iOrdinal2 == 2) {
            zc8VarA = zc8.a(zc8VarA, dd8.a(zc8VarA.z, d2, str, null, 0, 0, false, false, false, 1017));
        } else if (iOrdinal2 == 4 || iOrdinal2 == 5) {
            List<dd8> list = zc8VarA.z.w;
            ArrayList arrayList = new ArrayList(ph1.n(list, 10));
            for (dd8 dd8VarA : list) {
                if (dd8VarA.z == i) {
                    d = d2;
                    dd8VarA = dd8.a(dd8VarA, d, str2, null, 0, 0, false, false, false, 1017);
                } else {
                    d = d2;
                }
                arrayList.add(dd8VarA);
                str2 = str;
                d2 = d;
            }
            zc8VarA = zc8.a(zc8VarA, dd8.a(zc8VarA.z, 0.0d, null, arrayList, 0, 0, false, false, false, 1015));
        }
        e(new a.i(zc8VarA));
    }
}
