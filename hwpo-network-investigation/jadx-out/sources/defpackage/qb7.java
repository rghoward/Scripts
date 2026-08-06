package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qb7 {
    public static final s27<Object> a = je7.a();

    public static final void a(ox6.c cVar, int i, int i2) {
        if (!(cVar instanceof gw2)) {
            b(cVar, i & cVar.v, i2);
            return;
        }
        gw2 gw2Var = (gw2) cVar;
        int i3 = gw2Var.H;
        b(cVar, i3 & i, i2);
        int i4 = (~i3) & i;
        for (ox6.c cVar2 = gw2Var.I; cVar2 != null; cVar2 = cVar2.y) {
            a(cVar2, i4, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(ox6.c cVar, int i, int i2) {
        if (i2 != 0 || cVar.R1()) {
            if ((i & 2) != 0 && (cVar instanceof lr5)) {
                ew2.f((lr5) cVar).Q();
                if (i2 == 2) {
                    ew2.d(cVar, 2).P1();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                ew2.f(cVar).Q();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                ew2.f(cVar).f0(false);
            }
            if ((i & 256) != 0 && (cVar instanceof bn4)) {
                if (i2 == 1) {
                    qr5 qr5VarF = ew2.f(cVar);
                    qr5VarF.l0(qr5VarF.i0 + 1);
                } else if (i2 == 2) {
                    qr5 qr5VarF2 = ew2.f(cVar);
                    qr5VarF2.l0(qr5VarF2.i0 - 1);
                }
                if (i2 != 2) {
                    qr5 qr5VarF3 = ew2.f(cVar);
                    if (qr5VarF3.i0 != 0 && !qr5VarF3.D() && !qr5VarF3.E() && !qr5VarF3.h0) {
                        ur5.a(qr5VarF3).s(qr5VarF3);
                    }
                }
            }
            if ((i & 4) != 0 && (cVar instanceof a73)) {
                b73.a((a73) cVar);
            }
            if ((i & 8) != 0 && (cVar instanceof qb9)) {
                ew2.f(cVar).K = true;
            }
            if ((i & 64) != 0 && (cVar instanceof gt7)) {
                vr5 vr5Var = ew2.f((gt7) cVar).Z;
                vr5Var.p.K = true;
                hf6 hf6Var = vr5Var.q;
                if (hf6Var != null) {
                    hf6Var.Q = true;
                }
            }
            if ((i & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 && (cVar instanceof o94)) {
                o94 o94Var = (o94) cVar;
                q31.b = null;
                o94Var.k0(q31.a);
                if (q31.b != null) {
                    if (!o94Var.q().G) {
                        uc5.b("visitChildren called on an unattached node");
                    }
                    k37 k37Var = new k37(new ox6.c[16]);
                    ox6.c cVar2 = o94Var.q().y;
                    if (cVar2 == null) {
                        ew2.a(k37Var, o94Var.q());
                    } else {
                        k37Var.d(cVar2);
                    }
                    while (true) {
                        int i3 = k37Var.v;
                        if (i3 == 0) {
                            break;
                        }
                        ox6.c cVarB = (ox6.c) k37Var.o(i3 - 1);
                        if ((cVarB.w & 1024) == 0) {
                            ew2.a(k37Var, cVarB);
                        } else {
                            while (cVarB != null) {
                                if ((cVarB.v & 1024) != 0) {
                                    k37 k37Var2 = null;
                                    while (cVarB != null) {
                                        if (cVarB instanceof ba4) {
                                            ba4 ba4Var = (ba4) cVarB;
                                            ew2.g(ba4Var).getFocusOwner().l(ba4Var);
                                        } else if ((cVarB.v & 1024) != 0 && (cVarB instanceof gw2)) {
                                            int i4 = 0;
                                            for (ox6.c cVar3 = ((gw2) cVarB).I; cVar3 != null; cVar3 = cVar3.y) {
                                                if ((cVar3.v & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        cVarB = cVar3;
                                                    } else {
                                                        if (k37Var2 == null) {
                                                            k37Var2 = new k37(new ox6.c[16]);
                                                        }
                                                        if (cVarB != null) {
                                                            k37Var2.d(cVarB);
                                                            cVarB = null;
                                                        }
                                                        k37Var2.d(cVar3);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        cVarB = ew2.b(k37Var2);
                                    }
                                    break;
                                }
                                cVarB = cVarB.y;
                            }
                        }
                    }
                }
            }
            if ((i & 4096) != 0 && (cVar instanceof q84)) {
                q84 q84Var = (q84) cVar;
                ew2.g(q84Var).getFocusOwner().m(q84Var);
            }
            if ((i & 2097152) != 0 && (cVar instanceof nb5) && i2 == 2) {
                ((nb5) cVar).X0();
            }
        }
    }

    public static final void c(ox6.c cVar) {
        if (!cVar.G) {
            uc5.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(cVar, -1, 0);
    }

    public static final int d(ox6.b bVar) {
        int i = bVar instanceof ir5 ? 3 : 1;
        if (bVar instanceof y63) {
            i |= 4;
        }
        if (bVar instanceof ob9) {
            i |= 8;
        }
        if (bVar instanceof f58) {
            i |= 16;
        }
        if ((bVar instanceof qx6) || (bVar instanceof tx6)) {
            i |= 32;
        }
        if (bVar instanceof o84) {
            i |= 4096;
        }
        if (bVar instanceof e94) {
            i |= AudioConstants.AUDIO_FILE_BUFFER_SIZE;
        }
        if (bVar instanceof nh7) {
            i |= 256;
        }
        if (bVar instanceof ft7) {
            i |= 64;
        }
        if (bVar instanceof th7) {
            i |= 4194304;
        }
        if (bVar instanceof yh7) {
            i |= 128;
        }
        return bVar instanceof xv0 ? 524288 | i : i;
    }

    public static final int e(ox6.c cVar) {
        int i = cVar.v;
        if (i != 0) {
            return i;
        }
        Class<?> cls = cVar.getClass();
        s27<Object> s27Var = a;
        int iD = s27Var.d(cls);
        if (iD >= 0) {
            return s27Var.c[iD];
        }
        int i2 = cVar instanceof lr5 ? 3 : 1;
        if (cVar instanceof a73) {
            i2 |= 4;
        }
        if (cVar instanceof qb9) {
            i2 |= 8;
        }
        if (cVar instanceof g58) {
            i2 |= 16;
        }
        if (cVar instanceof sx6) {
            i2 |= 32;
        }
        if (cVar instanceof gt7) {
            i2 |= 64;
        }
        if (cVar instanceof nq5) {
            i2 |= 4194432;
        } else if (cVar instanceof ml6) {
            i2 |= 128;
        }
        if (cVar instanceof bn4) {
            i2 |= 256;
        }
        if (cVar instanceof s20) {
            i2 |= 512;
        }
        if (cVar instanceof ba4) {
            i2 |= 1024;
        }
        if (cVar instanceof o94) {
            i2 |= AudioConstants.AUDIO_FILE_BUFFER_SIZE;
        }
        if (cVar instanceof q84) {
            i2 |= 4096;
        }
        if (cVar instanceof so5) {
            i2 |= 8192;
        }
        if (cVar instanceof sx8) {
            i2 |= 16384;
        }
        if (cVar instanceof ju1) {
            i2 |= 32768;
        }
        if (cVar instanceof wv9) {
            i2 |= 131072;
        }
        if (cVar instanceof txa) {
            i2 |= 262144;
        }
        if (cVar instanceof xv0) {
            i2 |= 524288;
        }
        if (cVar instanceof y2b) {
            i2 |= 1048576;
        }
        if (cVar instanceof nb5) {
            i2 |= 2097152;
        }
        if (cVar instanceof op0) {
            i2 |= 8388608;
        }
        s27Var.h(i2, cls);
        return i2;
    }

    public static final int f(ox6.c cVar) {
        if (!(cVar instanceof gw2)) {
            return e(cVar);
        }
        gw2 gw2Var = (gw2) cVar;
        int iF = gw2Var.H;
        for (ox6.c cVar2 = gw2Var.I; cVar2 != null; cVar2 = cVar2.y) {
            iF |= f(cVar2);
        }
        return iF;
    }

    public static final boolean g(int i) {
        return ((i & 128) != 0) | ((i & 4194304) != 0);
    }
}
