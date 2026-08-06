package defpackage;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import io.ably.lib.util.Crypto;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.models.carousel.Carousel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dfa extends pi4 implements oh4<no5, Boolean> {
    /* JADX WARN: Code duplicated, block: B:109:0x01c3 A[PHI: r16
      0x01c3: PHI (r16v2 mo5) = (r16v0 mo5), (r16v0 mo5), (r16v0 mo5), (r16v0 mo5), (r16v3 mo5) binds: [B:162:0x0284, B:164:0x0294, B:158:0x027c, B:143:0x0242, B:107:0x01c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:183:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:186:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:196:0x0319  */
    /* JADX WARN: Code duplicated, block: B:20:0x0079  */
    /* JADX WARN: Code duplicated, block: B:24:0x0089  */
    /* JADX WARN: Code duplicated, block: B:327:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:72:0x0149  */
    @Override // defpackage.oh4
    public final Boolean invoke(no5 no5Var) {
        lo1 lo1Var;
        final mo5 mo5Var;
        mo5 mo5Var2;
        mo5 mo5Var3;
        Integer numValueOf;
        KeyEvent keyEvent = no5Var.a;
        final bfa bfaVar = (bfa) this.receiver;
        kja kjaVar = bfaVar.f;
        boolean z = bfaVar.d;
        boolean z2 = true;
        if (keyEvent.getAction() != 0 || Character.isISOControl(keyEvent.getUnicodeChar())) {
            lo1Var = null;
        } else {
            vm2 vm2Var = bfaVar.i;
            vm2Var.getClass();
            int unicodeChar = keyEvent.getUnicodeChar();
            if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                vm2Var.a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                numValueOf = null;
            } else {
                Integer num = vm2Var.a;
                if (num != null) {
                    vm2Var.a = null;
                    int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
                    Integer numValueOf2 = Integer.valueOf(deadChar);
                    if (deadChar == 0) {
                        numValueOf2 = null;
                    }
                    if (numValueOf2 != null) {
                        unicodeChar = numValueOf2.intValue();
                    }
                    numValueOf = Integer.valueOf(unicodeChar);
                } else {
                    numValueOf = Integer.valueOf(unicodeChar);
                }
            }
            if (numValueOf != null) {
                lo1Var = new lo1(new StringBuilder().appendCodePoint(numValueOf.intValue()).toString(), 1);
            } else {
                lo1Var = null;
            }
        }
        if (lo1Var != null) {
            if (z) {
                bfaVar.a(ws0.h(lo1Var));
                kjaVar.a = null;
            } else {
                z2 = false;
            }
        } else if (db7.b(keyEvent) == 2) {
            bfaVar.j.getClass();
            int iA = xo5.a(keyEvent);
            if (iA == 9) {
                long jB = ds6.b(keyEvent.getKeyCode());
                if (lo5.a(jB, lo5.f)) {
                    mo5Var = mo5.j0;
                } else if (lo5.a(jB, lo5.g)) {
                    mo5Var = mo5.k0;
                } else if (lo5.a(jB, lo5.d)) {
                    mo5Var = mo5.b0;
                } else if (lo5.a(jB, lo5.e)) {
                    mo5Var = mo5.c0;
                } else {
                    mo5Var = null;
                }
            } else if (iA == 1) {
                long jB2 = ds6.b(keyEvent.getKeyCode());
                if (lo5.a(jB2, lo5.f)) {
                    mo5Var = mo5.C;
                } else if (lo5.a(jB2, lo5.g)) {
                    mo5Var = mo5.D;
                } else if (lo5.a(jB2, lo5.d)) {
                    mo5Var = mo5.J;
                } else if (lo5.a(jB2, lo5.e)) {
                    mo5Var = mo5.K;
                } else if (lo5.a(jB2, lo5.s)) {
                    mo5Var = mo5.S;
                } else {
                    mo5Var = null;
                }
            } else {
                mo5Var = null;
            }
            if (mo5Var == null) {
                int iA2 = xo5.a(keyEvent);
                long jB3 = ds6.b(keyEvent.getKeyCode());
                boolean zA = lo5.a(jB3, lo5.s);
                mo5 mo5Var4 = mo5.m0;
                mo5 mo5Var5 = mo5.O;
                if (zA) {
                    if (iA2 == 0 || iA2 == 8 || iA2 == 12) {
                        mo5Var = mo5Var5;
                    } else if (iA2 == 2 || iA2 == 10) {
                        mo5Var = mo5.Q;
                    } else {
                        mo5Var = null;
                    }
                } else if ((lo5.a(jB3, lo5.r) || lo5.a(jB3, lo5.E)) && (iA2 == 0 || iA2 == 8 || iA2 == 2 || iA2 == 10)) {
                    mo5Var = mo5Var4;
                } else {
                    mo5Var = null;
                }
                if (mo5Var == null) {
                    int iA3 = xo5.a(keyEvent);
                    mo5 mo5Var6 = mo5.h0;
                    mo5 mo5Var7 = mo5.i0;
                    if (iA3 == 10) {
                        long jB4 = ds6.b(keyEvent.getKeyCode());
                        mo5Var2 = mo5Var7;
                        if (lo5.a(jB4, lo5.f) || lo5.a(jB4, lo5.H)) {
                            mo5Var3 = mo5.d0;
                        } else if (lo5.a(jB4, lo5.g) || lo5.a(jB4, lo5.I)) {
                            mo5Var3 = mo5.e0;
                        } else if (lo5.a(jB4, lo5.d) || lo5.a(jB4, lo5.F)) {
                            mo5Var3 = mo5.g0;
                        } else if (lo5.a(jB4, lo5.e) || lo5.a(jB4, lo5.G)) {
                            mo5Var3 = mo5.f0;
                        } else {
                            mo5Var3 = null;
                        }
                    } else {
                        mo5Var2 = mo5Var7;
                        if (iA3 == 2) {
                            long jB5 = ds6.b(keyEvent.getKeyCode());
                            if (lo5.a(jB5, lo5.f) || lo5.a(jB5, lo5.H)) {
                                mo5Var3 = mo5.x;
                            } else if (lo5.a(jB5, lo5.g) || lo5.a(jB5, lo5.I)) {
                                mo5Var3 = mo5.w;
                            } else if (lo5.a(jB5, lo5.d) || lo5.a(jB5, lo5.F)) {
                                mo5Var3 = mo5.z;
                            } else if (lo5.a(jB5, lo5.e) || lo5.a(jB5, lo5.G)) {
                                mo5Var3 = mo5.y;
                            } else if (lo5.a(jB5, lo5.k)) {
                                mo5Var3 = mo5Var5;
                            } else if (lo5.a(jB5, lo5.t)) {
                                mo5Var3 = mo5.R;
                            } else if (lo5.a(jB5, lo5.B)) {
                                mo5Var3 = mo5.l0;
                            } else {
                                mo5Var3 = null;
                            }
                        } else if (iA3 == 8) {
                            long jB6 = ds6.b(keyEvent.getKeyCode());
                            if (lo5.a(jB6, lo5.v) || lo5.a(jB6, lo5.J)) {
                                mo5Var3 = mo5Var6;
                            } else if (lo5.a(jB6, lo5.w) || lo5.a(jB6, lo5.K)) {
                                mo5Var3 = mo5Var2;
                            } else {
                                mo5Var3 = null;
                            }
                        } else if (iA3 == 1 && lo5.a(ds6.b(keyEvent.getKeyCode()), lo5.t)) {
                            mo5Var3 = mo5.T;
                        } else {
                            mo5Var3 = null;
                        }
                    }
                    if (mo5Var3 == null) {
                        df3 df3Var = uo5.a.a;
                        int iA4 = xo5.a(keyEvent);
                        mo5 mo5Var8 = mo5.p0;
                        if (iA4 != 10) {
                            mo5 mo5Var9 = mo5.L;
                            mo5 mo5Var10 = mo5.N;
                            mo5 mo5Var11 = mo5.M;
                            if (iA4 == 2) {
                                long jB7 = ds6.b(keyEvent.getKeyCode());
                                if (lo5.a(jB7, lo5.j) || lo5.a(jB7, lo5.x) || lo5.a(jB7, lo5.N)) {
                                    mo5Var8 = mo5Var9;
                                } else if (lo5.a(jB7, lo5.l)) {
                                    mo5Var8 = mo5Var11;
                                } else if (lo5.a(jB7, lo5.m)) {
                                    mo5Var8 = mo5Var10;
                                } else if (lo5.a(jB7, lo5.i)) {
                                    mo5Var8 = mo5.U;
                                } else if (!lo5.a(jB7, lo5.n)) {
                                    if (lo5.a(jB7, lo5.o)) {
                                        mo5Var8 = mo5.o0;
                                    } else {
                                        mo5Var8 = null;
                                    }
                                }
                            } else if (iA4 == 8) {
                                long jB8 = ds6.b(keyEvent.getKeyCode());
                                if (lo5.a(jB8, lo5.f) || lo5.a(jB8, lo5.H)) {
                                    mo5Var8 = mo5.V;
                                } else if (lo5.a(jB8, lo5.g) || lo5.a(jB8, lo5.I)) {
                                    mo5Var8 = mo5.W;
                                } else if (lo5.a(jB8, lo5.d) || lo5.a(jB8, lo5.F)) {
                                    mo5Var8 = mo5.X;
                                } else if (lo5.a(jB8, lo5.e) || lo5.a(jB8, lo5.G)) {
                                    mo5Var8 = mo5.Y;
                                } else if (lo5.a(jB8, lo5.C) || lo5.a(jB8, lo5.L)) {
                                    mo5Var8 = mo5.Z;
                                } else if (lo5.a(jB8, lo5.D) || lo5.a(jB8, lo5.M)) {
                                    mo5Var8 = mo5.a0;
                                } else if (lo5.a(jB8, lo5.v) || lo5.a(jB8, lo5.J)) {
                                    mo5Var8 = mo5Var6;
                                } else if (lo5.a(jB8, lo5.w) || lo5.a(jB8, lo5.K)) {
                                    mo5Var8 = mo5Var2;
                                } else if (lo5.a(jB8, lo5.x) || lo5.a(jB8, lo5.N)) {
                                    mo5Var8 = mo5Var11;
                                } else {
                                    mo5Var8 = null;
                                }
                            } else if (iA4 == 0) {
                                long jB9 = ds6.b(keyEvent.getKeyCode());
                                if (lo5.a(jB9, lo5.f) || lo5.a(jB9, lo5.H)) {
                                    mo5Var8 = mo5.u;
                                } else if (lo5.a(jB9, lo5.g) || lo5.a(jB9, lo5.I)) {
                                    mo5Var8 = mo5.v;
                                } else if (lo5.a(jB9, lo5.d) || lo5.a(jB9, lo5.F)) {
                                    mo5Var8 = mo5.E;
                                } else if (lo5.a(jB9, lo5.e) || lo5.a(jB9, lo5.G)) {
                                    mo5Var8 = mo5.F;
                                } else if (lo5.a(jB9, lo5.h)) {
                                    mo5Var8 = mo5.G;
                                } else if (lo5.a(jB9, lo5.C) || lo5.a(jB9, lo5.L)) {
                                    mo5Var8 = mo5.H;
                                } else if (lo5.a(jB9, lo5.D) || lo5.a(jB9, lo5.M)) {
                                    mo5Var8 = mo5.I;
                                } else if (lo5.a(jB9, lo5.v) || lo5.a(jB9, lo5.J)) {
                                    mo5Var8 = mo5.A;
                                } else if (lo5.a(jB9, lo5.w) || lo5.a(jB9, lo5.K)) {
                                    mo5Var8 = mo5.B;
                                } else if (lo5.a(jB9, lo5.r) || lo5.a(jB9, lo5.E)) {
                                    mo5Var8 = mo5Var4;
                                } else if (lo5.a(jB9, lo5.s)) {
                                    mo5Var8 = mo5Var5;
                                } else if (lo5.a(jB9, lo5.t)) {
                                    mo5Var8 = mo5.P;
                                } else if (lo5.a(jB9, lo5.A)) {
                                    mo5Var8 = mo5Var11;
                                } else if (lo5.a(jB9, lo5.y)) {
                                    mo5Var8 = mo5Var10;
                                } else if (lo5.a(jB9, lo5.z)) {
                                    mo5Var8 = mo5Var9;
                                } else if (lo5.a(jB9, lo5.p)) {
                                    mo5Var8 = mo5.n0;
                                } else {
                                    mo5Var8 = null;
                                }
                            } else {
                                mo5Var8 = null;
                            }
                        } else if (!lo5.a(ds6.b(keyEvent.getKeyCode()), lo5.o)) {
                            mo5Var8 = null;
                        }
                        mo5Var = mo5Var8;
                    } else {
                        mo5Var = mo5Var3;
                    }
                }
            }
            if (mo5Var == null || (mo5Var.t && !z)) {
                z2 = false;
            } else {
                final cl8 cl8Var = new cl8();
                cl8Var.t = true;
                oh4 oh4Var = new oh4() { // from class: zea
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        Integer numD;
                        Integer numC;
                        Integer numC2;
                        Integer numD2;
                        ria riaVar;
                        ria riaVar2;
                        sia siaVar;
                        sia siaVar2;
                        ria riaVar3;
                        ria riaVar4;
                        sia siaVar3;
                        sia siaVar4;
                        Integer numC3;
                        Integer numD3;
                        Integer numD4;
                        Integer numC4;
                        z1b.a aVar;
                        ufa ufaVar = (ufa) obj;
                        int iOrdinal = mo5Var.ordinal();
                        bfa bfaVar2 = bfaVar;
                        cl8 cl8Var2 = cl8Var;
                        kha khaVar = null;
                        switch (iOrdinal) {
                            case 0:
                                ufaVar.e.a = null;
                                if (ufaVar.g.u.length() > 0) {
                                    if (!lja.c(ufaVar.f)) {
                                        boolean zE = ufaVar.e();
                                        long j = ufaVar.f;
                                        if (!zE) {
                                            int iE = lja.e(j);
                                            ufaVar.o(iE, iE);
                                        } else {
                                            int iF = lja.f(j);
                                            ufaVar.o(iF, iF);
                                        }
                                    } else {
                                        ufaVar.g();
                                        g2b g2bVar = g2b.a;
                                    }
                                }
                                break;
                            case 1:
                                ufaVar.e.a = null;
                                if (ufaVar.g.u.length() > 0) {
                                    if (!lja.c(ufaVar.f)) {
                                        boolean zE2 = ufaVar.e();
                                        long j2 = ufaVar.f;
                                        if (!zE2) {
                                            int iF2 = lja.f(j2);
                                            ufaVar.o(iF2, iF2);
                                        } else {
                                            int iE2 = lja.e(j2);
                                            ufaVar.o(iE2, iE2);
                                        }
                                    } else {
                                        ufaVar.k();
                                        g2b g2bVar2 = g2b.a;
                                    }
                                }
                                break;
                            case 2:
                                kja kjaVar2 = ufaVar.e;
                                kjaVar2.a = null;
                                iw iwVar = ufaVar.g;
                                String str = iwVar.u;
                                String str2 = iwVar.u;
                                if (str.length() > 0) {
                                    if (!ufaVar.e()) {
                                        kjaVar2.a = null;
                                        if (str2.length() > 0 && (numD = ufaVar.d()) != null) {
                                            int iIntValue = numD.intValue();
                                            ufaVar.o(iIntValue, iIntValue);
                                        }
                                    } else {
                                        kjaVar2.a = null;
                                        if (str2.length() > 0 && (numC = ufaVar.c()) != null) {
                                            int iIntValue2 = numC.intValue();
                                            ufaVar.o(iIntValue2, iIntValue2);
                                        }
                                    }
                                }
                                break;
                            case 3:
                                kja kjaVar3 = ufaVar.e;
                                kjaVar3.a = null;
                                iw iwVar2 = ufaVar.g;
                                String str3 = iwVar2.u;
                                String str4 = iwVar2.u;
                                if (str3.length() > 0) {
                                    if (!ufaVar.e()) {
                                        kjaVar3.a = null;
                                        if (str4.length() > 0 && (numC2 = ufaVar.c()) != null) {
                                            int iIntValue3 = numC2.intValue();
                                            ufaVar.o(iIntValue3, iIntValue3);
                                        }
                                    } else {
                                        kjaVar3.a = null;
                                        if (str4.length() > 0 && (numD2 = ufaVar.d()) != null) {
                                            int iIntValue4 = numD2.intValue();
                                            ufaVar.o(iIntValue4, iIntValue4);
                                        }
                                    }
                                }
                                break;
                            case 4:
                                ufaVar.h();
                                break;
                            case 5:
                                ufaVar.j();
                                break;
                            case 6:
                                ufaVar.m();
                                break;
                            case 7:
                                ufaVar.l();
                                break;
                            case 8:
                                ufaVar.e.a = null;
                                if (ufaVar.g.u.length() > 0) {
                                    if (!ufaVar.e()) {
                                        ufaVar.l();
                                    } else {
                                        ufaVar.m();
                                    }
                                }
                                break;
                            case 9:
                                ufaVar.e.a = null;
                                if (ufaVar.g.u.length() > 0) {
                                    if (!ufaVar.e()) {
                                        ufaVar.m();
                                    } else {
                                        ufaVar.l();
                                    }
                                }
                                break;
                            case 10:
                                if (ufaVar.g.u.length() > 0 && (riaVar = ufaVar.c) != null) {
                                    int iF3 = ufaVar.f(riaVar, -1);
                                    ufaVar.o(iF3, iF3);
                                }
                                break;
                            case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                if (ufaVar.g.u.length() > 0 && (riaVar2 = ufaVar.c) != null) {
                                    int iF4 = ufaVar.f(riaVar2, 1);
                                    ufaVar.o(iF4, iF4);
                                }
                                break;
                            case 12:
                            case 48:
                                g2b g2bVar3 = g2b.a;
                                break;
                            case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                if (ufaVar.g.u.length() > 0 && (siaVar = ufaVar.i) != null) {
                                    int iR = ufaVar.r(siaVar, -1);
                                    ufaVar.o(iR, iR);
                                }
                                break;
                            case 14:
                                if (ufaVar.g.u.length() > 0 && (siaVar2 = ufaVar.i) != null) {
                                    int iR2 = ufaVar.r(siaVar2, 1);
                                    ufaVar.o(iR2, iR2);
                                }
                                break;
                            case h4c.e /* 15 */:
                                ufaVar.e.a = null;
                                if (ufaVar.g.u.length() > 0) {
                                    ufaVar.o(0, 0);
                                }
                                break;
                            case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                                ufaVar.e.a = null;
                                iw iwVar3 = ufaVar.g;
                                if (iwVar3.u.length() > 0) {
                                    int length = iwVar3.u.length();
                                    ufaVar.o(length, length);
                                }
                                break;
                            case 17:
                                bfaVar2.b.d(false);
                                break;
                            case 18:
                                bfaVar2.b.p();
                                break;
                            case 19:
                                bfaVar2.b.f();
                                break;
                            case InboxPagingSource.PAGE_SIZE /* 20 */:
                                List<ra3> listQ = ufaVar.q(new m7(2));
                                if (listQ != null) {
                                    bfaVar2.a(listQ);
                                    g2b g2bVar4 = g2b.a;
                                }
                                break;
                            case 21:
                                List<ra3> listQ2 = ufaVar.q(new afa());
                                if (listQ2 != null) {
                                    bfaVar2.a(listQ2);
                                    g2b g2bVar5 = g2b.a;
                                }
                                break;
                            case 22:
                                List<ra3> listQ3 = ufaVar.q(new q78(1));
                                if (listQ3 != null) {
                                    bfaVar2.a(listQ3);
                                    g2b g2bVar6 = g2b.a;
                                }
                                break;
                            case 23:
                                List<ra3> listQ4 = ufaVar.q(new qx0(2));
                                if (listQ4 != null) {
                                    bfaVar2.a(listQ4);
                                    g2b g2bVar7 = g2b.a;
                                }
                                break;
                            case 24:
                                List<ra3> listQ5 = ufaVar.q(new u7(3));
                                if (listQ5 != null) {
                                    bfaVar2.a(listQ5);
                                    g2b g2bVar8 = g2b.a;
                                }
                                break;
                            case 25:
                                List<ra3> listQ6 = ufaVar.q(new v7(3));
                                if (listQ6 != null) {
                                    bfaVar2.a(listQ6);
                                    g2b g2bVar9 = g2b.a;
                                }
                                break;
                            case 26:
                                ufaVar.e.a = null;
                                iw iwVar4 = ufaVar.g;
                                if (iwVar4.u.length() > 0) {
                                    ufaVar.o(0, iwVar4.u.length());
                                }
                                break;
                            case 27:
                                ufaVar.g();
                                ufaVar.n();
                                break;
                            case 28:
                                ufaVar.k();
                                ufaVar.n();
                                break;
                            case 29:
                                if (ufaVar.g.u.length() > 0 && (riaVar3 = ufaVar.c) != null) {
                                    int iF5 = ufaVar.f(riaVar3, -1);
                                    ufaVar.o(iF5, iF5);
                                }
                                ufaVar.n();
                                break;
                            case 30:
                                if (ufaVar.g.u.length() > 0 && (riaVar4 = ufaVar.c) != null) {
                                    int iF6 = ufaVar.f(riaVar4, 1);
                                    ufaVar.o(iF6, iF6);
                                }
                                ufaVar.n();
                                break;
                            case 31:
                                if (ufaVar.g.u.length() > 0 && (siaVar3 = ufaVar.i) != null) {
                                    int iR3 = ufaVar.r(siaVar3, -1);
                                    ufaVar.o(iR3, iR3);
                                }
                                ufaVar.n();
                                break;
                            case 32:
                                if (ufaVar.g.u.length() > 0 && (siaVar4 = ufaVar.i) != null) {
                                    int iR4 = ufaVar.r(siaVar4, 1);
                                    ufaVar.o(iR4, iR4);
                                }
                                ufaVar.n();
                                break;
                            case 33:
                                ufaVar.e.a = null;
                                if (ufaVar.g.u.length() > 0) {
                                    ufaVar.o(0, 0);
                                }
                                ufaVar.n();
                                break;
                            case 34:
                                ufaVar.e.a = null;
                                iw iwVar5 = ufaVar.g;
                                if (iwVar5.u.length() > 0) {
                                    int length2 = iwVar5.u.length();
                                    ufaVar.o(length2, length2);
                                }
                                ufaVar.n();
                                break;
                            case 35:
                                kja kjaVar4 = ufaVar.e;
                                kjaVar4.a = null;
                                iw iwVar6 = ufaVar.g;
                                String str5 = iwVar6.u;
                                String str6 = iwVar6.u;
                                if (str5.length() > 0) {
                                    if (ufaVar.e()) {
                                        kjaVar4.a = null;
                                        if (str6.length() > 0 && (numD3 = ufaVar.d()) != null) {
                                            int iIntValue5 = numD3.intValue();
                                            ufaVar.o(iIntValue5, iIntValue5);
                                        }
                                    } else {
                                        kjaVar4.a = null;
                                        if (str6.length() > 0 && (numC3 = ufaVar.c()) != null) {
                                            int iIntValue6 = numC3.intValue();
                                            ufaVar.o(iIntValue6, iIntValue6);
                                        }
                                    }
                                }
                                ufaVar.n();
                                break;
                            case 36:
                                kja kjaVar5 = ufaVar.e;
                                kjaVar5.a = null;
                                iw iwVar7 = ufaVar.g;
                                String str7 = iwVar7.u;
                                String str8 = iwVar7.u;
                                if (str7.length() > 0) {
                                    if (ufaVar.e()) {
                                        kjaVar5.a = null;
                                        if (str8.length() > 0 && (numC4 = ufaVar.c()) != null) {
                                            int iIntValue7 = numC4.intValue();
                                            ufaVar.o(iIntValue7, iIntValue7);
                                        }
                                    } else {
                                        kjaVar5.a = null;
                                        if (str8.length() > 0 && (numD4 = ufaVar.d()) != null) {
                                            int iIntValue8 = numD4.intValue();
                                            ufaVar.o(iIntValue8, iIntValue8);
                                        }
                                    }
                                }
                                ufaVar.n();
                                break;
                            case 37:
                                ufaVar.h();
                                ufaVar.n();
                                break;
                            case 38:
                                ufaVar.j();
                                ufaVar.n();
                                break;
                            case 39:
                                ufaVar.m();
                                ufaVar.n();
                                break;
                            case 40:
                                ufaVar.l();
                                ufaVar.n();
                                break;
                            case 41:
                                ufaVar.e.a = null;
                                if (ufaVar.g.u.length() > 0) {
                                    if (ufaVar.e()) {
                                        ufaVar.m();
                                    } else {
                                        ufaVar.l();
                                    }
                                }
                                ufaVar.n();
                                break;
                            case 42:
                                ufaVar.e.a = null;
                                if (ufaVar.g.u.length() > 0) {
                                    if (ufaVar.e()) {
                                        ufaVar.l();
                                    } else {
                                        ufaVar.m();
                                    }
                                }
                                ufaVar.n();
                                break;
                            case 43:
                                ufaVar.e.a = null;
                                if (ufaVar.g.u.length() > 0) {
                                    long j3 = ufaVar.f;
                                    int i = lja.c;
                                    int i2 = (int) (j3 & 4294967295L);
                                    ufaVar.o(i2, i2);
                                }
                                break;
                            case Carousel.ENTITY_TYPE /* 44 */:
                                if (bfaVar2.e) {
                                    cl8Var2.t = bfaVar2.a.x.t.r.b(bfaVar2.l);
                                } else {
                                    bfaVar2.a(ws0.h(new lo1("\n", 1)));
                                }
                                g2b g2bVar10 = g2b.a;
                                break;
                            case 45:
                                if (bfaVar2.e) {
                                    cl8Var2.t = false;
                                } else {
                                    bfaVar2.a(ws0.h(new lo1("\t", 1)));
                                }
                                g2b g2bVar11 = g2b.a;
                                break;
                            case 46:
                                z1b z1bVar = bfaVar2.h;
                                if (z1bVar != null) {
                                    z1bVar.a(kha.a(ufaVar.h, ufaVar.g, ufaVar.f, 4));
                                }
                                z1b z1bVar2 = bfaVar2.h;
                                if (z1bVar2 != null) {
                                    z1b.a aVar2 = z1bVar2.b;
                                    if (aVar2 != null && (aVar = aVar2.a) != null) {
                                        z1bVar2.b = aVar;
                                        z1bVar2.d -= aVar2.b.a.u.length();
                                        z1bVar2.c = new z1b.a(z1bVar2.c, aVar2.b);
                                        khaVar = aVar.b;
                                    }
                                    if (khaVar != null) {
                                        bfaVar2.k.invoke(khaVar);
                                        g2b g2bVar12 = g2b.a;
                                    }
                                }
                                break;
                            case 47:
                                z1b z1bVar3 = bfaVar2.h;
                                if (z1bVar3 != null) {
                                    z1b.a aVar3 = z1bVar3.c;
                                    if (aVar3 != null) {
                                        z1bVar3.c = aVar3.a;
                                        kha khaVar2 = aVar3.b;
                                        z1bVar3.b = new z1b.a(z1bVar3.b, khaVar2);
                                        z1bVar3.d = khaVar2.a.u.length() + z1bVar3.d;
                                        khaVar = aVar3.b;
                                    }
                                    if (khaVar != null) {
                                        bfaVar2.k.invoke(khaVar);
                                        g2b g2bVar13 = g2b.a;
                                    }
                                }
                                break;
                            default:
                                u.b();
                                return null;
                        }
                        return g2b.a;
                    }
                };
                kha khaVar = bfaVar.c;
                ufa ufaVar = new ufa(khaVar, bfaVar.g, bfaVar.a.d(), kjaVar);
                oh4Var.invoke(ufaVar);
                boolean zB = lja.b(ufaVar.f, khaVar.b);
                iw iwVar = ufaVar.g;
                if (!zB || !xj5.a(iwVar, khaVar.a)) {
                    bfaVar.k.invoke(kha.a(khaVar, iwVar, ufaVar.f, 4));
                }
                z1b z1bVar = bfaVar.h;
                if (z1bVar != null) {
                    z1bVar.f = true;
                }
                z2 = cl8Var.t;
            }
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
