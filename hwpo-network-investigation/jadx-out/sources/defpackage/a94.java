package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a94 extends pi4 implements mh4<g2b> {
    /* JADX WARN: Code duplicated, block: B:16:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x005a A[LOOP:0: B:7:0x0025->B:17:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x010d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x010f A[LOOP:4: B:56:0x00e1->B:66:0x010f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x0112 A[EDGE_INSN: B:74:0x0112->B:67:0x0112 BREAK  A[LOOP:0: B:7:0x0025->B:17:0x005a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0112 A[EDGE_INSN: B:92:0x0112->B:67:0x0112 BREAK  A[LOOP:4: B:56:0x00e1->B:66:0x010f], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.mh4
    public final g2b invoke() {
        kb7 kb7Var;
        ox6.c cVar;
        b94 b94Var = (b94) this.receiver;
        d37<ba4> d37Var = b94Var.c;
        d37<q84> d37Var2 = b94Var.d;
        h94 h94Var = b94Var.a;
        ba4 ba4VarV = h94Var.v();
        w94 w94Var = w94.w;
        if (ba4VarV == null) {
            Object[] objArr = d37Var2.b;
            long[] jArr = d37Var2.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((j & 255) < 128) {
                                ((q84) objArr[(i << 3) + i3]).m0(w94Var);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                        if (i != length) {
                            break;
                        }
                        i++;
                    }
                }
            }
        } else if (ba4VarV.G) {
            if (d37Var.c(ba4VarV)) {
                ba4VarV.i2();
            }
            w94 w94VarA0 = ba4VarV.a0();
            if (!ba4VarV.t.G) {
                uc5.b("visitAncestors called on an unattached node");
            }
            ox6.c cVar2 = ba4VarV.t;
            qr5 qr5VarF = ew2.f(ba4VarV);
            int i4 = 0;
            while (qr5VarF != null) {
                if ((qr5VarF.Y.f.w & 5120) != 0) {
                    while (cVar != null) {
                        int i5 = cVar.v;
                        if ((i5 & 5120) != 0) {
                            if ((i5 & 1024) != 0) {
                                i4++;
                            }
                            if ((cVar instanceof q84) && d37Var2.c(cVar)) {
                                if (i4 <= 1) {
                                    ((q84) cVar).m0(w94VarA0);
                                } else {
                                    ((q84) cVar).m0(w94.u);
                                }
                                d37Var2.l((q84) cVar);
                            }
                        }
                        cVar = cVar.x;
                    }
                }
                cVar = cVar2;
                qr5VarF = qr5VarF.I();
                cVar2 = (qr5VarF == null || (kb7Var = qr5VarF.Y) == null) ? null : kb7Var.e;
            }
            Object[] objArr2 = d37Var2.b;
            long[] jArr2 = d37Var2.a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i6 = 0;
                while (true) {
                    long j2 = jArr2[i6];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i6 != length2) {
                            break;
                            break;
                        }
                        i6++;
                    } else {
                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                        for (int i8 = 0; i8 < i7; i8++) {
                            if ((j2 & 255) < 128) {
                                ((q84) objArr2[(i6 << 3) + i8]).m0(w94Var);
                            }
                            j2 >>= 8;
                        }
                        if (i7 != 8) {
                            break;
                        }
                        if (i6 != length2) {
                            break;
                        }
                        i6++;
                    }
                }
            }
        }
        if (h94Var.v() == null || h94Var.c.a0() == w94Var) {
            h94Var.y();
        }
        d37Var.b();
        d37Var2.b();
        b94Var.e = false;
        return g2b.a;
    }
}
