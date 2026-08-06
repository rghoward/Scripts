package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gw2 extends ox6.c {
    public final int H = qb7.e(this);
    public ox6.c I;

    @Override // ox6.c
    public final void S1() {
        super.S1();
        for (ox6.c cVar = this.I; cVar != null; cVar = cVar.y) {
            cVar.b2(this.A);
            if (!cVar.G) {
                cVar.S1();
            }
        }
    }

    @Override // ox6.c
    public final void T1() {
        for (ox6.c cVar = this.I; cVar != null; cVar = cVar.y) {
            cVar.T1();
        }
        super.T1();
    }

    @Override // ox6.c
    public final void X1() {
        super.X1();
        for (ox6.c cVar = this.I; cVar != null; cVar = cVar.y) {
            cVar.X1();
        }
    }

    @Override // ox6.c
    public final void Y1() {
        for (ox6.c cVar = this.I; cVar != null; cVar = cVar.y) {
            cVar.Y1();
        }
        super.Y1();
    }

    @Override // ox6.c
    public final void Z1() {
        super.Z1();
        for (ox6.c cVar = this.I; cVar != null; cVar = cVar.y) {
            cVar.Z1();
        }
    }

    @Override // ox6.c
    public final void a2(ox6.c cVar) {
        this.t = cVar;
        for (ox6.c cVar2 = this.I; cVar2 != null; cVar2 = cVar2.y) {
            cVar2.a2(cVar);
        }
    }

    @Override // ox6.c
    public final void b2(mb7 mb7Var) {
        this.A = mb7Var;
        for (ox6.c cVar = this.I; cVar != null; cVar = cVar.y) {
            cVar.b2(mb7Var);
        }
    }

    public final <T extends dw2> T c2(T t) {
        ox6.c cVarQ = t.q();
        if (cVarQ != t) {
            ox6.c cVar = t instanceof ox6.c ? (ox6.c) t : null;
            ox6.c cVar2 = cVar != null ? cVar.x : null;
            if (cVarQ != this.t || !xj5.a(cVar2, this)) {
                aa0.c("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (cVarQ.G) {
                uc5.b("Cannot delegate to an already attached node");
            }
            cVarQ.a2(this.t);
            int i = this.v;
            int iF = qb7.f(cVarQ);
            cVarQ.v = iF;
            int i2 = this.v;
            int i3 = iF & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof lr5)) {
                uc5.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + cVarQ);
            }
            cVarQ.y = this.I;
            this.I = cVarQ;
            cVarQ.x = this;
            e2(iF | this.v, false);
            if (this.G) {
                if (i3 == 0 || (i & 2) != 0) {
                    b2(this.A);
                } else {
                    kb7 kb7Var = ew2.f(this).Y;
                    this.t.b2(null);
                    kb7Var.g();
                }
                cVarQ.S1();
                cVarQ.Y1();
                if (!cVarQ.G) {
                    uc5.b("autoInvalidateInsertedNode called on unattached node");
                }
                qb7.a(cVarQ, -1, 1);
            }
        }
        return t;
    }

    public final void d2(dw2 dw2Var) {
        ox6.c cVar = null;
        for (ox6.c cVar2 = this.I; cVar2 != null; cVar2 = cVar2.y) {
            if (cVar2 == dw2Var) {
                boolean z = cVar2.G;
                if (z) {
                    s27<Object> s27Var = qb7.a;
                    if (!z) {
                        uc5.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    qb7.a(cVar2, -1, 2);
                    cVar2.Z1();
                    cVar2.T1();
                }
                cVar2.a2(cVar2);
                cVar2.w = 0;
                ox6.c cVar3 = cVar2.y;
                if (cVar == null) {
                    this.I = cVar3;
                } else {
                    cVar.y = cVar3;
                }
                cVar2.y = null;
                cVar2.x = null;
                int i = this.v;
                int iF = qb7.f(this);
                e2(iF, true);
                if (this.G && (i & 2) != 0 && (iF & 2) == 0) {
                    kb7 kb7Var = ew2.f(this).Y;
                    this.t.b2(null);
                    kb7Var.g();
                    return;
                }
                return;
            }
            cVar = cVar2;
        }
        tn2.d(dw2Var, "Could not find delegate: ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final void e2(int i, boolean z) {
        ox6.c cVar;
        int i2 = this.v;
        this.v = i;
        if (i2 != i) {
            ox6.c cVar2 = this.t;
            if (cVar2 == this) {
                this.w = i;
            }
            boolean z2 = this.G;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.v;
                    r2.v = i;
                    if (r2 == cVar2) {
                        break;
                    } else {
                        r2 = r2.x;
                    }
                }
                if (z && r2 == cVar2) {
                    i = qb7.f(cVar2);
                    cVar2.v = i;
                }
                int i3 = i | ((r2 == 0 || (cVar = r2.y) == null) ? 0 : cVar.w);
                for (?? r3 = r2; r3 != 0; r3 = r3.x) {
                    i3 |= r3.v;
                    r3.w = i3;
                }
            }
        }
    }
}
