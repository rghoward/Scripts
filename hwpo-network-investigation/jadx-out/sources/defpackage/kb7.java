package defpackage;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kb7 {
    public final qr5 a;
    public final b b;
    public final fd5 c;
    public mb7 d;
    public final m8a e;
    public ox6.c f;
    public k37<ox6.b> g;
    public k37<ox6.b> h;
    public final k37<ox6> i;
    public a j;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a {
        public ox6.c a;
        public int b;
        public k37<ox6.b> c;
        public k37<ox6.b> d;
        public boolean e;

        public a(ox6.c cVar, int i, k37<ox6.b> k37Var, k37<ox6.b> k37Var2, boolean z) {
            this.a = cVar;
            this.b = i;
            this.c = k37Var;
            this.d = k37Var2;
            this.e = z;
        }

        public final boolean a(int i, int i2) {
            k37<ox6.b> k37Var = this.c;
            int i3 = this.b;
            ox6.b bVar = k37Var.t[i + i3];
            ox6.b bVar2 = this.d.t[i3 + i2];
            return xj5.a(bVar, bVar2) || bVar.getClass() == bVar2.getClass();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends ox6.c {
        public final String toString() {
            return "<Head>";
        }
    }

    public kb7(qr5 qr5Var) {
        this.a = qr5Var;
        b bVar = new b();
        bVar.w = -1;
        this.b = bVar;
        fd5 fd5Var = new fd5(qr5Var);
        this.c = fd5Var;
        this.d = fd5Var;
        m8a m8aVar = fd5Var.n0;
        this.e = m8aVar;
        this.f = m8aVar;
        this.i = new k37<>(new ox6[16]);
    }

    public static final void a(kb7 kb7Var, ox6.c cVar, mb7 mb7Var) {
        for (ox6.c cVar2 = cVar.x; cVar2 != null; cVar2 = cVar2.x) {
            if (cVar2 == kb7Var.b) {
                qr5 qr5VarI = kb7Var.a.I();
                mb7Var.L = qr5VarI != null ? qr5VarI.Y.c : null;
                kb7Var.d = mb7Var;
                return;
            } else {
                if ((cVar2.v & 2) != 0) {
                    return;
                }
                cVar2.b2(mb7Var);
            }
        }
    }

    public static ox6.c b(ox6.b bVar, ox6.c cVar) {
        ox6.c cVarA;
        if (bVar instanceof vx6) {
            cVarA = ((vx6) bVar).a();
            cVarA.v = qb7.f(cVarA);
        } else {
            qi0 qi0Var = new qi0();
            qi0Var.v = qb7.d(bVar);
            qi0Var.H = bVar;
            qi0Var.I = true;
            qi0Var.K = new HashSet<>();
            cVarA = qi0Var;
        }
        if (cVarA.G) {
            uc5.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        cVarA.B = true;
        ox6.c cVar2 = cVar.y;
        if (cVar2 != null) {
            cVar2.x = cVarA;
            cVarA.y = cVar2;
        }
        cVar.y = cVarA;
        cVarA.x = cVar;
        return cVarA;
    }

    public static ox6.c c(ox6.c cVar) {
        boolean z = cVar.G;
        if (z) {
            s27<Object> s27Var = qb7.a;
            if (!z) {
                uc5.b("autoInvalidateRemovedNode called on unattached node");
            }
            qb7.a(cVar, -1, 2);
            cVar.Z1();
            cVar.T1();
        }
        ox6.c cVar2 = cVar.y;
        ox6.c cVar3 = cVar.x;
        if (cVar2 != null) {
            cVar2.x = cVar3;
            cVar.y = null;
        }
        if (cVar3 != null) {
            cVar3.y = cVar2;
            cVar.x = null;
        }
        cVar3.getClass();
        return cVar3;
    }

    public static void h(ox6.b bVar, ox6.b bVar2, ox6.c cVar) {
        if ((bVar instanceof vx6) && (bVar2 instanceof vx6)) {
            cVar.getClass();
            ((vx6) bVar2).b(cVar);
            if (cVar.G) {
                qb7.c(cVar);
                return;
            } else {
                cVar.C = true;
                return;
            }
        }
        if (!(cVar instanceof qi0)) {
            uc5.b("Unknown Modifier.Node type");
            return;
        }
        qi0 qi0Var = (qi0) cVar;
        if (qi0Var.G) {
            qi0Var.d2();
        }
        qi0Var.H = bVar2;
        qi0Var.v = qb7.d(bVar2);
        if (qi0Var.G) {
            qi0Var.c2(false);
        }
        if (cVar.G) {
            qb7.c(cVar);
        } else {
            cVar.C = true;
        }
    }

    public final boolean d(int i) {
        return (this.f.w & i) != 0;
    }

    public final void e() {
        for (ox6.c cVar = this.f; cVar != null; cVar = cVar.y) {
            cVar.Y1();
            if (cVar.B) {
                s27<Object> s27Var = qb7.a;
                if (!cVar.G) {
                    uc5.b("autoInvalidateInsertedNode called on unattached node");
                }
                qb7.a(cVar, -1, 1);
            }
            if (cVar.C) {
                qb7.c(cVar);
            }
            cVar.B = false;
            cVar.C = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:174:0x0140 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:40:0x0109 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x011c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0126  */
    /* JADX WARN: Code duplicated, block: B:53:0x013e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0188  */
    /* JADX WARN: Code duplicated, block: B:73:0x018b  */
    /* JADX WARN: Code duplicated, block: B:75:0x018f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0192  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:78:0x019e
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void f(int r32, defpackage.k37<ox6.b> r33, defpackage.k37<ox6.b> r34, ox6.c r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 921
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb7.f(int, k37, k37, ox6$c, boolean):void");
    }

    public final void g() {
        qr5 qr5Var;
        mr5 mr5Var;
        ln7 ln7Var;
        ox6.c cVar = this.e.x;
        mb7 mb7Var = this.c;
        while (true) {
            qr5Var = this.a;
            if (cVar == null) {
                break;
            }
            lr5 lr5VarC = ew2.c(cVar);
            if (lr5VarC != null) {
                mb7 mb7Var2 = cVar.A;
                if (mb7Var2 != null) {
                    mr5Var = (mr5) mb7Var2;
                    lr5 lr5Var = mr5Var.n0;
                    mr5Var.g2(lr5VarC);
                    if (lr5Var != cVar && (ln7Var = mr5Var.g0) != null) {
                        ln7Var.invalidate();
                    }
                } else {
                    mr5Var = new mr5(qr5Var, lr5VarC);
                    cVar.b2(mr5Var);
                }
                mb7Var.L = mr5Var;
                mr5Var.K = mb7Var;
                mb7Var = mr5Var;
            } else {
                cVar.b2(mb7Var);
            }
            cVar = cVar.x;
        }
        qr5 qr5VarI = qr5Var.I();
        mb7Var.L = qr5VarI != null ? qr5VarI.Y.c : null;
        this.d = mb7Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        ox6.c cVar = this.f;
        m8a m8aVar = this.e;
        if (cVar == m8aVar) {
            sb.append("]");
        } else {
            while (cVar != null && cVar != m8aVar) {
                sb.append(String.valueOf(cVar));
                if (cVar.y == m8aVar) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                cVar = cVar.y;
            }
        }
        return sb.toString();
    }
}
