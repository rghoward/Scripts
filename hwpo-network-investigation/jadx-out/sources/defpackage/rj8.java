package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import qj8.c;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class rj8 implements v21 {
    public final /* synthetic */ qj8 t;
    public final /* synthetic */ jp8 u;

    public rj8(qj8 qj8Var, jp8 jp8Var) {
        this.t = qj8Var;
        this.u = jp8Var;
    }

    @Override // defpackage.v21
    public final void onFailure(o21 o21Var, IOException iOException) {
        qj8.g(this.t, iOException, null, 6);
    }

    @Override // defpackage.v21
    public final void onResponse(o21 o21Var, qu8 qu8Var) {
        kw9 kw9VarA;
        yq9 yq9VarB;
        int iIntValue;
        String strE;
        try {
            qv9 qv9VarF = this.t.f(qu8Var);
            nu4 nu4Var = qu8Var.y;
            int size = nu4Var.size();
            int i = 0;
            int i2 = 0;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            Integer numF = null;
            Integer numF2 = null;
            while (i2 < size) {
                if (nu4Var.e(i2).equalsIgnoreCase("Sec-WebSocket-Extensions")) {
                    String strJ = nu4Var.j(i2);
                    int i3 = i;
                    while (i3 < strJ.length()) {
                        nu4Var = nu4Var;
                        int iG = vtb.g(strJ, ',', i3, i, 4);
                        int iF = vtb.f(strJ, ';', i3, iG);
                        int iJ = vtb.j(i3, iF, strJ);
                        String strSubstring = strJ.substring(iJ, vtb.k(iJ, iF, strJ));
                        i3 = iF + 1;
                        if (strSubstring.equalsIgnoreCase("permessage-deflate")) {
                            if (z) {
                                z4 = true;
                            }
                            while (true) {
                                i3 = i3;
                                while (true) {
                                    if (i3 >= iG) {
                                        break;
                                    }
                                    int iF2 = vtb.f(strJ, ';', i3, iG);
                                    int iF3 = vtb.f(strJ, '=', i3, iF2);
                                    int iJ2 = vtb.j(i3, iF3, strJ);
                                    String strSubstring2 = strJ.substring(iJ2, vtb.k(iJ2, iF3, strJ));
                                    if (iF3 < iF2) {
                                        int iJ3 = vtb.j(iF3 + 1, iF2, strJ);
                                        strE = z2a.E(strJ.substring(iJ3, vtb.k(iJ3, iF2, strJ)));
                                    } else {
                                        strE = null;
                                    }
                                    i3 = iF2 + 1;
                                    if (strSubstring2.equalsIgnoreCase("client_max_window_bits")) {
                                        if (numF != null) {
                                            z4 = true;
                                        }
                                        numF = strE != null ? v2a.f(strE) : null;
                                        if (numF != null) {
                                        }
                                        z4 = true;
                                    } else if (strSubstring2.equalsIgnoreCase("client_no_context_takeover")) {
                                        if (z2) {
                                            z4 = true;
                                        }
                                        if (strE != null) {
                                            z4 = true;
                                        }
                                        z2 = true;
                                    } else {
                                        if (strSubstring2.equalsIgnoreCase("server_max_window_bits")) {
                                            if (numF2 != null) {
                                                z4 = true;
                                            }
                                            numF2 = strE != null ? v2a.f(strE) : null;
                                            if (numF2 != null) {
                                            }
                                        } else if (strSubstring2.equalsIgnoreCase("server_no_context_takeover")) {
                                            if (z3) {
                                                z4 = true;
                                            }
                                            if (strE != null) {
                                                z4 = true;
                                            }
                                            z3 = true;
                                        }
                                        z4 = true;
                                    }
                                }
                            }
                            i = 0;
                            z = true;
                        } else {
                            i3 = i3;
                            i = 0;
                            z4 = true;
                        }
                    }
                }
                i2++;
                nu4Var = nu4Var;
                i = 0;
            }
            this.t.d = new qkb(z, numF, z2, numF2, z3, z4);
            if (z4 || numF != null || (numF2 != null && (8 > (iIntValue = numF2.intValue()) || iIntValue >= 16))) {
                qj8 qj8Var = this.t;
                synchronized (qj8Var) {
                    qj8Var.p.clear();
                    qj8Var.close(1010, "unexpected Sec-WebSocket-Extensions in response header");
                }
            }
            String str = ytb.b + " WebSocket " + this.u.a.h();
            final qj8 qj8Var2 = this.t;
            gy0 gy0Var = new gy0(qv9VarF);
            qkb qkbVar = qj8Var2.d;
            qkbVar.getClass();
            synchronized (qj8Var2) {
                try {
                    qj8Var2.m = str;
                    qj8Var2.n = gy0Var;
                    qj8Var2.k = new ukb(gy0Var.c, qj8Var2.b, qkbVar.a, qkbVar.c, qj8Var2.e);
                    qj8Var2.i = qj8Var2.new c();
                    long j = qj8Var2.c;
                    if (j != 0) {
                        final long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                        y9a y9aVar = qj8Var2.l;
                        String strConcat = str.concat(" ping");
                        mh4 mh4Var = new mh4() { // from class: nj8
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                ukb ukbVar;
                                qj8 qj8Var3 = qj8Var2;
                                long j2 = nanos;
                                synchronized (qj8Var3) {
                                    try {
                                        if (!qj8Var3.u && (ukbVar = qj8Var3.k) != null) {
                                            int i4 = qj8Var3.w ? qj8Var3.v : -1;
                                            qj8Var3.v++;
                                            qj8Var3.w = true;
                                            g2b g2bVar = g2b.a;
                                            if (i4 != -1) {
                                                StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
                                                sb.append(qj8Var3.c);
                                                sb.append("ms (after ");
                                                qj8.g(qj8Var3, new SocketTimeoutException(i34.b(i4 - 1, " successful ping/pongs)", sb)), null, 2);
                                            } else {
                                                try {
                                                    g01 g01Var = g01.w;
                                                    g01Var.getClass();
                                                    ukbVar.h(9, g01Var);
                                                } catch (IOException e) {
                                                    qj8.g(qj8Var3, e, null, 2);
                                                }
                                            }
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                return Long.valueOf(j2);
                            }
                        };
                        y9aVar.getClass();
                        y9aVar.d(new x9a(strConcat, mh4Var), nanos);
                    }
                    if (!qj8Var2.p.isEmpty()) {
                        qj8Var2.i();
                    }
                    g2b g2bVar = g2b.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            qj8Var2.j = new tkb(gy0Var.b, qj8Var2, qkbVar.a, qkbVar.e);
            qj8 qj8Var3 = this.t;
            try {
                qj8Var3.a.onOpen(qj8Var3, qu8Var);
                while (qj8Var3.s == -1) {
                    tkb tkbVar = qj8Var3.j;
                    tkbVar.getClass();
                    tkbVar.h();
                }
            } catch (Exception e) {
                qj8.g(qj8Var3, e, null, 6);
            } finally {
                qj8Var3.h();
            }
        } catch (IOException e2) {
            qj8.g(this.t, e2, qu8Var, 4);
            vtb.b(qu8Var);
            qv9 qv9Var = qu8Var.A;
            if (qv9Var != null && (yq9VarB = qv9Var.b()) != null) {
                vtb.b(yq9VarB);
            }
            qv9 qv9Var2 = qu8Var.A;
            if (qv9Var2 == null || (kw9VarA = qv9Var2.a()) == null) {
                return;
            }
            vtb.b(kw9VarA);
        }
    }
}
