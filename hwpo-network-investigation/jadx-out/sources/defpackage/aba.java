package defpackage;

import android.os.Trace;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class aba extends ox6.c implements lr5, a73, qb9 {
    public iw H;
    public wja I;
    public qa4.a J;
    public oh4<? super ria, g2b> K;
    public int L;
    public boolean M;
    public int N;
    public int O;
    public List<iw.c<mz7>> P;
    public oh4<? super List<sk8>, g2b> Q;
    public ia9 R;
    public oh4<? super a, g2b> S;
    public Map<ei, Integer> T;
    public n07 U;
    public zaa V;
    public a W;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final iw a;
        public iw b;
        public boolean c = false;
        public n07 d = null;

        public a(iw iwVar, iw iwVar2) {
            this.a = iwVar;
            this.b = iwVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return xj5.a(this.a, aVar.a) && xj5.a(this.b, aVar.b) && this.c == aVar.c && xj5.a(this.d, aVar.d);
        }

        public final int hashCode() {
            int iA = uo2.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
            n07 n07Var = this.d;
            return iA + (n07Var == null ? 0 : n07Var.hashCode());
        }

        public final String toString() {
            return "TextSubstitutionValue(original=" + ((Object) this.a) + ", substitution=" + ((Object) this.b) + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ')';
        }
    }

    public aba() {
        throw null;
    }

    public aba(iw iwVar, wja wjaVar, qa4.a aVar, oh4 oh4Var, int i, boolean z, int i2, int i3, List list, oh4 oh4Var2, ia9 ia9Var, oh4 oh4Var3) {
        this.H = iwVar;
        this.I = wjaVar;
        this.J = aVar;
        this.K = oh4Var;
        this.L = i;
        this.M = z;
        this.N = i2;
        this.O = i3;
        this.P = list;
        this.Q = oh4Var2;
        this.R = ia9Var;
        this.S = oh4Var3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [oh4] */
    /* JADX WARN: Type inference failed for: r0v2, types: [zaa] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // defpackage.qb9
    public final void E1(hc9 hc9Var) {
        zaa zaaVar = this.V;
        ?? r0 = zaaVar;
        if (zaaVar == null) {
            ?? r1 = new oh4() { // from class: zaa
                @Override // defpackage.oh4
                public final Object invoke(Object obj) {
                    ria riaVar;
                    List list = (List) obj;
                    aba abaVar = this.t;
                    ria riaVar2 = abaVar.d2().n;
                    if (riaVar2 != null) {
                        qia qiaVar = riaVar2.a;
                        riaVar = new ria(new qia(qiaVar.a, wja.e(abaVar.I, uh1.k, 0L, null, 0L, 0, 0L, 16777214), qiaVar.c, qiaVar.d, qiaVar.e, qiaVar.f, qiaVar.g, qiaVar.h, qiaVar.i, qiaVar.j), riaVar2.b, riaVar2.c);
                        list.add(riaVar);
                    } else {
                        riaVar = null;
                    }
                    return Boolean.valueOf(riaVar != null);
                }
            };
            this.V = r1;
            r0 = r1;
        }
        iw iwVar = this.H;
        ho5<Object>[] ho5VarArr = ec9.a;
        hc9Var.d(ac9.C, ws0.h(iwVar));
        a aVar = this.W;
        if (aVar != null) {
            iw iwVar2 = aVar.b;
            gc9<iw> gc9Var = ac9.D;
            ho5<Object>[] ho5VarArr2 = ec9.a;
            ho5<Object> ho5Var = ho5VarArr2[16];
            hc9Var.d(gc9Var, iwVar2);
            boolean z = aVar.c;
            gc9<Boolean> gc9Var2 = ac9.E;
            ho5<Object> ho5Var2 = ho5VarArr2[17];
            hc9Var.d(gc9Var2, Boolean.valueOf(z));
        }
        hc9Var.d(kb9.l, new k3(null, new rp9(1, this)));
        hc9Var.d(kb9.m, new k3(null, new tq4(1, this)));
        hc9Var.d(kb9.n, new k3(null, new xf1(2, this)));
        ec9.a(hc9Var, r0);
    }

    @Override // ox6.c
    public final boolean R1() {
        return false;
    }

    public final void c2(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            d2().g(this.H, this.I, this.J, this.L, this.M, this.N, this.O, this.P);
        }
        if (this.G) {
            if (z2 || (z && this.V != null)) {
                ew2.f(this).R();
            }
            if (z2 || z3 || z4) {
                ew2.f(this).Q();
                b73.a(this);
            }
            if (z) {
                b73.a(this);
            }
        }
    }

    public final n07 d2() {
        if (this.U == null) {
            this.U = new n07(this.H, this.I, this.J, this.L, this.M, this.N, this.O, this.P);
        }
        n07 n07Var = this.U;
        n07Var.getClass();
        return n07Var;
    }

    @Override // defpackage.lr5
    public final gl6 e(hl6 hl6Var, cl6 cl6Var, long j) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            n07 n07VarE2 = e2(hl6Var);
            boolean zC = n07VarE2.c(j, hl6Var.getLayoutDirection());
            ria riaVar = n07VarE2.n;
            if (riaVar == null) {
                throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + n07VarE2);
            }
            long j2 = riaVar.c;
            riaVar.b.a.a();
            if (zC) {
                ew2.d(this, 2).E1();
                oh4<? super ria, g2b> oh4Var = this.K;
                if (oh4Var != null) {
                    oh4Var.invoke(riaVar);
                }
                ia9 ia9Var = this.R;
                if (ia9Var != null) {
                    ria riaVar2 = ia9Var.w.b;
                    if (riaVar2 != null && !xj5.a(riaVar2.a.a, riaVar.a.a)) {
                        ia9Var.u.g();
                    }
                    ia9Var.w = a1a.a(ia9Var.w, null, riaVar, 1);
                }
                Map<ei, Integer> linkedHashMap = this.T;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap<>(2);
                }
                linkedHashMap.put(fi.a, Integer.valueOf(Math.round(riaVar.d)));
                linkedHashMap.put(fi.b, Integer.valueOf(Math.round(riaVar.e)));
                this.T = linkedHashMap;
            }
            oh4<? super List<sk8>, g2b> oh4Var2 = this.Q;
            if (oh4Var2 != null) {
                oh4Var2.invoke(riaVar.f);
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            jz7 jz7VarE = cl6Var.E(xx1.a.b(i, i, i2, i2));
            Map<ei, Integer> map = this.T;
            map.getClass();
            gl6 gl6VarY0 = hl6Var.y0(i, i2, map, new r0(1, jz7VarE));
            Trace.endSection();
            return gl6VarY0;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final n07 e2(tx2 tx2Var) {
        n07 n07Var;
        a aVar = this.W;
        if (aVar != null && aVar.c && (n07Var = aVar.d) != null) {
            n07Var.d(tx2Var);
            return n07Var;
        }
        n07 n07VarD2 = d2();
        n07VarD2.d(tx2Var);
        return n07VarD2;
    }

    @Override // defpackage.lr5
    public final int f(df6 df6Var, pj5 pj5Var, int i) {
        return e2(df6Var).a(i, df6Var.getLayoutDirection());
    }

    public final boolean f2(oh4<? super ria, g2b> oh4Var, oh4<? super List<sk8>, g2b> oh4Var2, ia9 ia9Var, oh4<? super a, g2b> oh4Var3) {
        boolean z;
        if (this.K != oh4Var) {
            this.K = oh4Var;
            z = true;
        } else {
            z = false;
        }
        if (this.Q != oh4Var2) {
            this.Q = oh4Var2;
            z = true;
        }
        if (!xj5.a(this.R, ia9Var)) {
            this.R = ia9Var;
            z = true;
        }
        if (this.S == oh4Var3) {
            return z;
        }
        this.S = oh4Var3;
        return true;
    }

    public final boolean g2(wja wjaVar, List list, int i, int i2, boolean z, qa4.a aVar, int i3) {
        boolean z2 = !this.I.c(wjaVar);
        this.I = wjaVar;
        if (!xj5.a(this.P, list)) {
            this.P = list;
            z2 = true;
        }
        if (this.O != i) {
            this.O = i;
            z2 = true;
        }
        if (this.N != i2) {
            this.N = i2;
            z2 = true;
        }
        if (this.M != z) {
            this.M = z;
            z2 = true;
        }
        if (!xj5.a(this.J, aVar)) {
            this.J = aVar;
            z2 = true;
        }
        if (this.L == i3) {
            return z2;
        }
        this.L = i3;
        return true;
    }

    public final boolean h2(iw iwVar) {
        boolean zA = xj5.a(this.H.u, iwVar.u);
        boolean z = (zA && xj5.a(this.H.t, iwVar.t)) ? false : true;
        if (z) {
            this.H = iwVar;
        }
        if (!zA) {
            this.W = null;
        }
        return z;
    }

    @Override // defpackage.lr5
    public final int j(df6 df6Var, pj5 pj5Var, int i) {
        return e2(df6Var).a(i, df6Var.getLayoutDirection());
    }

    /* JADX WARN: Failed to calculate best type for var: r4v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v16 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v16 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v17 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v1 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v16 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    @Override // defpackage.a73
    public final void t(defpackage.tr5 r23) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aba.t(tr5):void");
    }

    @Override // defpackage.lr5
    public final int v(df6 df6Var, pj5 pj5Var, int i) {
        return ida.a(e2(df6Var).e(df6Var.getLayoutDirection()).b());
    }

    @Override // defpackage.lr5
    public final int x(df6 df6Var, pj5 pj5Var, int i) {
        return ida.a(e2(df6Var).e(df6Var.getLayoutDirection()).c());
    }
}
