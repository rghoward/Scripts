package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class p62 extends vx6<a72> {
    public final s85 A;
    public final p94 B;
    public final mva t;
    public final kha u;
    public final u56 v;
    public final boolean w;
    public final boolean x;
    public final ag7 y;
    public final qga z;

    public p62(mva mvaVar, kha khaVar, u56 u56Var, boolean z, boolean z2, ag7 ag7Var, qga qgaVar, s85 s85Var, p94 p94Var) {
        this.t = mvaVar;
        this.u = khaVar;
        this.v = u56Var;
        this.w = z;
        this.x = z2;
        this.y = ag7Var;
        this.z = qgaVar;
        this.A = s85Var;
        this.B = p94Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        final a72 a72Var = new a72();
        a72Var.J = this.t;
        a72Var.K = this.u;
        a72Var.L = this.v;
        a72Var.M = this.w;
        a72Var.N = this.x;
        a72Var.O = this.y;
        qga qgaVar = this.z;
        a72Var.P = qgaVar;
        a72Var.Q = this.A;
        a72Var.R = this.B;
        qgaVar.f = new mh4() { // from class: s62
            @Override // defpackage.mh4
            public final Object invoke() {
                qr5 qr5VarF = ew2.f(a72Var);
                if (!qr5VarF.M) {
                    ur5.a(qr5VarF).g(qr5VarF);
                }
                return g2b.a;
            }
        };
        return a72Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        a72 a72Var = (a72) cVar;
        boolean z = a72Var.N;
        boolean z2 = false;
        boolean z3 = z && !a72Var.M;
        s85 s85Var = a72Var.Q;
        qga qgaVar = a72Var.P;
        boolean z4 = this.w;
        boolean z5 = this.x;
        if (z5 && !z4) {
            z2 = true;
        }
        a72Var.J = this.t;
        kha khaVar = this.u;
        a72Var.K = khaVar;
        a72Var.L = this.v;
        a72Var.M = z4;
        a72Var.N = z5;
        a72Var.O = this.y;
        qga qgaVar2 = this.z;
        a72Var.P = qgaVar2;
        s85 s85Var2 = this.A;
        a72Var.Q = s85Var2;
        a72Var.R = this.B;
        if (z5 != z || z2 != z3 || !xj5.a(s85Var2, s85Var) || !lja.c(khaVar.b)) {
            ew2.f(a72Var).R();
        }
        if (xj5.a(qgaVar2, qgaVar)) {
            return;
        }
        qgaVar2.f = new lq1(1, a72Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p62)) {
            return false;
        }
        p62 p62Var = (p62) obj;
        return xj5.a(this.t, p62Var.t) && xj5.a(this.u, p62Var.u) && xj5.a(this.v, p62Var.v) && this.w == p62Var.w && this.x == p62Var.x && xj5.a(this.y, p62Var.y) && xj5.a(this.z, p62Var.z) && xj5.a(this.A, p62Var.A) && xj5.a(this.B, p62Var.B);
    }

    public final int hashCode() {
        return this.B.hashCode() + ((this.A.hashCode() + ((this.z.hashCode() + ((this.y.hashCode() + uo2.a(uo2.a(uo2.a((this.v.hashCode() + ((this.u.hashCode() + (this.t.hashCode() * 31)) * 31)) * 31, this.w, 31), this.x, 31), false, 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.t + ", value=" + this.u + ", state=" + this.v + ", readOnly=" + this.w + ", enabled=" + this.x + ", isPassword=false, offsetMapping=" + this.y + ", manager=" + this.z + ", imeOptions=" + this.A + ", focusRequester=" + this.B + ')';
    }
}
