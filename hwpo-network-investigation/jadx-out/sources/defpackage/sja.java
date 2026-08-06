package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sja extends vx6<vja> {
    public final String t;
    public final wja u;
    public final qa4.a v;
    public final int w;
    public final boolean x;
    public final int y;
    public final int z;

    public sja(String str, wja wjaVar, qa4.a aVar, int i, boolean z, int i2, int i3) {
        this.t = str;
        this.u = wjaVar;
        this.v = aVar;
        this.w = i;
        this.x = z;
        this.y = i2;
        this.z = i3;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        vja vjaVar = new vja();
        vjaVar.H = this.t;
        vjaVar.I = this.u;
        vjaVar.J = this.v;
        vjaVar.K = this.w;
        vjaVar.L = this.x;
        vjaVar.M = this.y;
        vjaVar.N = this.z;
        return vjaVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x006c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0074  */
    /* JADX WARN: Code duplicated, block: B:36:0x007a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0096  */
    /* JADX WARN: Code duplicated, block: B:44:0x009e  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        boolean z;
        String str;
        String str2;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z3;
        boolean z4;
        qa4.a aVar;
        qa4.a aVar2;
        int i5;
        int i6;
        vja vjaVar = (vja) cVar;
        vjaVar.getClass();
        wja wjaVar = vjaVar.I;
        boolean z5 = false;
        boolean z6 = true;
        wja wjaVar2 = this.u;
        if (wjaVar2 != wjaVar) {
            if (!wjaVar2.a.b(wjaVar.a)) {
                z = true;
            }
            str = vjaVar.H;
            str2 = this.t;
            if (!xj5.a(str, str2)) {
                vjaVar.H = str2;
                vjaVar.S = null;
                z5 = true;
            }
            z2 = !vjaVar.I.c(wjaVar2);
            vjaVar.I = wjaVar2;
            i = vjaVar.N;
            i2 = this.z;
            if (i != i2) {
                vjaVar.N = i2;
                z2 = true;
            }
            i3 = vjaVar.M;
            i4 = this.y;
            if (i3 != i4) {
                vjaVar.M = i4;
                z2 = true;
            }
            z3 = vjaVar.L;
            z4 = this.x;
            if (z3 != z4) {
                vjaVar.L = z4;
                z2 = true;
            }
            aVar = vjaVar.J;
            aVar2 = this.v;
            if (!xj5.a(aVar, aVar2)) {
                vjaVar.J = aVar2;
                z2 = true;
            }
            i5 = vjaVar.K;
            i6 = this.w;
            if (i5 == i6) {
                z6 = z2;
            } else {
                vjaVar.K = i6;
            }
            if (z || z5 || z6) {
                vjaVar.Q = null;
            }
            if (z5 || z6) {
                vjaVar.c2().f(vjaVar.H, vjaVar.I, vjaVar.J, vjaVar.K, vjaVar.L, vjaVar.M, vjaVar.N);
            }
            if (vjaVar.G) {
                if (z5 || (z && vjaVar.R != null)) {
                    ew2.f(vjaVar).R();
                }
                if (z5 || z6) {
                    ew2.f(vjaVar).Q();
                    b73.a(vjaVar);
                }
                if (z) {
                    b73.a(vjaVar);
                }
            }
            return;
        }
        wjaVar2.getClass();
        z = false;
        str = vjaVar.H;
        str2 = this.t;
        if (!xj5.a(str, str2)) {
            vjaVar.H = str2;
            vjaVar.S = null;
            z5 = true;
        }
        z2 = !vjaVar.I.c(wjaVar2);
        vjaVar.I = wjaVar2;
        i = vjaVar.N;
        i2 = this.z;
        if (i != i2) {
            vjaVar.N = i2;
            z2 = true;
        }
        i3 = vjaVar.M;
        i4 = this.y;
        if (i3 != i4) {
            vjaVar.M = i4;
            z2 = true;
        }
        z3 = vjaVar.L;
        z4 = this.x;
        if (z3 != z4) {
            vjaVar.L = z4;
            z2 = true;
        }
        aVar = vjaVar.J;
        aVar2 = this.v;
        if (!xj5.a(aVar, aVar2)) {
            vjaVar.J = aVar2;
            z2 = true;
        }
        i5 = vjaVar.K;
        i6 = this.w;
        if (i5 == i6) {
            z6 = z2;
        } else {
            vjaVar.K = i6;
        }
        if (z) {
            vjaVar.Q = null;
        } else {
            vjaVar.Q = null;
        }
        if (z5) {
            vjaVar.c2().f(vjaVar.H, vjaVar.I, vjaVar.J, vjaVar.K, vjaVar.L, vjaVar.M, vjaVar.N);
        } else {
            vjaVar.c2().f(vjaVar.H, vjaVar.I, vjaVar.J, vjaVar.K, vjaVar.L, vjaVar.M, vjaVar.N);
        }
        if (vjaVar.G) {
            return;
        }
        if (z5) {
            ew2.f(vjaVar).R();
        } else {
            ew2.f(vjaVar).R();
        }
        if (z5) {
            ew2.f(vjaVar).Q();
            b73.a(vjaVar);
        } else {
            ew2.f(vjaVar).Q();
            b73.a(vjaVar);
        }
        if (z) {
            b73.a(vjaVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sja)) {
            return false;
        }
        sja sjaVar = (sja) obj;
        return xj5.a(this.t, sjaVar.t) && xj5.a(this.u, sjaVar.u) && xj5.a(this.v, sjaVar.v) && this.w == sjaVar.w && this.x == sjaVar.x && this.y == sjaVar.y && this.z == sjaVar.z;
    }

    public final int hashCode() {
        return (((uo2.a(os2.a(this.w, (this.v.hashCode() + r43.a(this.u, this.t.hashCode() * 31, 31)) * 31, 31), this.x, 31) + this.y) * 31) + this.z) * 31;
    }
}
