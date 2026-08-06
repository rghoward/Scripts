package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class h45 implements Closeable {
    public static final Logger w;
    public final hy0 t;
    public final b u;
    public final s35.a v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static int a(int i, int i2, int i3) throws IOException {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            o03.a(u.a(i3, i, "PROTOCOL_ERROR padding ", " > remaining length "));
            return 0;
        }
    }

    static {
        Logger logger = Logger.getLogger(u35.class.getName());
        logger.getClass();
        w = logger;
    }

    public h45(hy0 hy0Var) {
        hy0Var.getClass();
        this.t = hy0Var;
        b bVar = new b(hy0Var);
        this.u = bVar;
        this.v = new s35.a(bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.t.close();
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0284  */
    /* JADX WARN: Code duplicated, block: B:175:0x0288  */
    /* JADX WARN: Code duplicated, block: B:230:0x0119 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0107  */
    /* JADX WARN: Code duplicated, block: B:69:0x010b  */
    /* JADX WARN: Code duplicated, block: B:76:0x012f  */
    /* JADX WARN: Code duplicated, block: B:96:0x015f  */
    public final boolean h(boolean z, c45.c cVar) throws Exception {
        int i;
        g01 g01VarR;
        c45 c45Var;
        Logger logger = w;
        hy0 hy0Var = this.t;
        try {
            hy0Var.n0(9L);
            int iO = vtb.o(hy0Var);
            if (iO > 16384) {
                o03.a(pp2.a(iO, "FRAME_SIZE_ERROR: "));
                return false;
            }
            int i2 = hy0Var.readByte() & MessagePack.Code.EXT_TIMESTAMP;
            byte b2 = hy0Var.readByte();
            int i3 = b2 & MessagePack.Code.EXT_TIMESTAMP;
            int i4 = hy0Var.readInt() & Integer.MAX_VALUE;
            if (i2 != 8 && logger.isLoggable(Level.FINE)) {
                u35.a.getClass();
                logger.fine(u35.b(true, i4, iO, i2, i3));
            }
            if (z && i2 != 4) {
                u35.a.getClass();
                y92.a(u35.a(i2), "Expected a SETTINGS frame but was ");
                return false;
            }
            ul3 ul3Var = null;
            switch (i2) {
                case 0:
                    if (i4 == 0) {
                        o03.a("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                        return false;
                    }
                    boolean z2 = (b2 & 1) != 0;
                    if ((b2 & 32) != 0) {
                        o03.a("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                        return false;
                    }
                    int i5 = (b2 & 8) != 0 ? hy0Var.readByte() & MessagePack.Code.EXT_TIMESTAMP : 0;
                    cVar.c(z2, i4, hy0Var, a.a(iO, i3, i5));
                    hy0Var.skip(i5);
                    return true;
                case 1:
                    if (i4 == 0) {
                        o03.a("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                        return false;
                    }
                    boolean z3 = (b2 & 1) != 0;
                    int i6 = (b2 & 8) != 0 ? hy0Var.readByte() & MessagePack.Code.EXT_TIMESTAMP : 0;
                    if ((b2 & 32) != 0) {
                        m(cVar, i4);
                        iO -= 5;
                    }
                    cVar.d(i4, k(a.a(iO, i3, i6), i6, i3, i4), z3);
                    return true;
                case 2:
                    if (iO != 5) {
                        o03.a(pk.d(iO, "TYPE_PRIORITY length: ", " != 5"));
                        return false;
                    }
                    if (i4 != 0) {
                        m(cVar, i4);
                        return true;
                    }
                    o03.a("TYPE_PRIORITY streamId == 0");
                    return false;
                case 3:
                    if (iO != 4) {
                        o03.a(pk.d(iO, "TYPE_RST_STREAM length: ", " != 4"));
                        return false;
                    }
                    if (i4 == 0) {
                        o03.a("TYPE_RST_STREAM streamId == 0");
                        return false;
                    }
                    int i7 = hy0Var.readInt();
                    ul3.u.getClass();
                    for (ul3 ul3Var2 : ul3.values()) {
                        if (ul3Var2.t == i7) {
                            ul3Var = ul3Var2;
                            if (ul3Var != null) {
                                cVar.g(i4, ul3Var);
                                return true;
                            }
                            o03.a(pp2.a(i7, "TYPE_RST_STREAM unexpected error code: "));
                            return false;
                        }
                    }
                    if (ul3Var != null) {
                        cVar.g(i4, ul3Var);
                        return true;
                    }
                    o03.a(pp2.a(i7, "TYPE_RST_STREAM unexpected error code: "));
                    return false;
                case 4:
                    if (i4 != 0) {
                        o03.a("TYPE_SETTINGS streamId != 0");
                        return false;
                    }
                    if ((b2 & 1) != 0) {
                        if (iO != 0) {
                            o03.a("FRAME_SIZE_ERROR ack frame should be empty!");
                            return false;
                        }
                        return true;
                    }
                    if (iO % 6 != 0) {
                        o03.a(pp2.a(iO, "TYPE_SETTINGS length % 6 != 0: "));
                        return false;
                    }
                    ok9 ok9Var = new ok9();
                    dg5 dg5VarI = uh8.i(uh8.j(0, iO), 6);
                    int i8 = dg5VarI.t;
                    int i9 = dg5VarI.u;
                    int i10 = dg5VarI.v;
                    if ((i10 > 0 && i8 <= i9) || (i10 < 0 && i9 <= i8)) {
                        while (true) {
                            short s = hy0Var.readShort();
                            byte[] bArr = vtb.a;
                            int i11 = s & 65535;
                            i = hy0Var.readInt();
                            if (i11 != 2) {
                                if (i11 != 4) {
                                    if (i11 == 5 && (i < 16384 || i > 16777215)) {
                                    }
                                } else if (i < 0) {
                                    o03.a("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                    return false;
                                }
                            } else if (i != 0 && i != 1) {
                                o03.a("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                return false;
                            }
                            ok9Var.b(i11, i);
                            if (i8 != i9) {
                                i8 += i10;
                            }
                        }
                        o03.a(pp2.a(i, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                        return false;
                    }
                    c45 c45Var2 = c45.this;
                    y9a.c(c45Var2.A, av.a(new StringBuilder(), c45Var2.v, " applyAndAckSettings"), 0L, new bm0(1, cVar, ok9Var), 6);
                    return true;
                case 5:
                    if (i4 == 0) {
                        o03.a("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                        return false;
                    }
                    int i12 = (b2 & 8) != 0 ? hy0Var.readByte() & MessagePack.Code.EXT_TIMESTAMP : 0;
                    cVar.f(hy0Var.readInt() & Integer.MAX_VALUE, k(a.a(iO - 4, i3, i12), i12, i3, i4));
                    return true;
                case 6:
                    if (iO != 8) {
                        o03.a(pp2.a(iO, "TYPE_PING length != 8: "));
                        return false;
                    }
                    if (i4 != 0) {
                        o03.a("TYPE_PING streamId != 0");
                        return false;
                    }
                    cVar.e(hy0Var.readInt(), (b2 & 1) != 0, hy0Var.readInt());
                    return true;
                case 7:
                    if (iO < 8) {
                        o03.a(pp2.a(iO, "TYPE_GOAWAY length < 8: "));
                        return false;
                    }
                    if (i4 != 0) {
                        o03.a("TYPE_GOAWAY streamId != 0");
                        return false;
                    }
                    int i13 = hy0Var.readInt();
                    int i14 = hy0Var.readInt();
                    int i15 = iO - 8;
                    ul3.u.getClass();
                    for (ul3 ul3Var3 : ul3.values()) {
                        if (ul3Var3.t == i14) {
                            ul3Var = ul3Var3;
                            if (ul3Var != null) {
                                o03.a(pp2.a(i14, "TYPE_GOAWAY unexpected error code: "));
                                return false;
                            }
                            g01VarR = g01.w;
                            if (i15 > 0) {
                                g01VarR = hy0Var.r(i15);
                            }
                            g01VarR.getClass();
                            g01VarR.g();
                            c45Var = c45.this;
                            synchronized (c45Var) {
                                Object[] array = c45Var.u.values().toArray(new i45[0]);
                                c45Var.y = true;
                                g2b g2bVar = g2b.a;
                            }
                            for (i45 i45Var : (i45[]) array) {
                                if (i45Var.a <= i13 && i45Var.i()) {
                                    ul3 ul3Var4 = ul3.REFUSED_STREAM;
                                    synchronized (i45Var) {
                                        try {
                                            if (i45Var.h() == null) {
                                                i45Var.l = ul3Var4;
                                                i45Var.notifyAll();
                                            }
                                            g2b g2bVar2 = g2b.a;
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    c45.this.m(i45Var.a);
                                }
                            }
                            return true;
                        }
                    }
                    if (ul3Var != null) {
                        o03.a(pp2.a(i14, "TYPE_GOAWAY unexpected error code: "));
                        return false;
                    }
                    g01VarR = g01.w;
                    if (i15 > 0) {
                        g01VarR = hy0Var.r(i15);
                    }
                    g01VarR.getClass();
                    g01VarR.g();
                    c45Var = c45.this;
                    synchronized (c45Var) {
                        Object[] array2 = c45Var.u.values().toArray(new i45[0]);
                        c45Var.y = true;
                        g2b g2bVar3 = g2b.a;
                        while (i < r2) {
                            if (i45Var.a <= i13) {
                            }
                        }
                        return true;
                    }
                case 8:
                    try {
                        if (iO != 4) {
                            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + iO);
                        }
                        long j = 2147483647L & ((long) hy0Var.readInt());
                        if (j == 0) {
                            throw new IOException("windowSizeIncrement was 0");
                        }
                        if (logger.isLoggable(Level.FINE)) {
                            u35.a.getClass();
                            logger.fine(u35.c(i4, iO, j, true));
                        }
                        c45 c45Var3 = c45.this;
                        if (i4 == 0) {
                            synchronized (c45Var3) {
                                c45Var3.N += j;
                                c45Var3.notifyAll();
                                g2b g2bVar4 = g2b.a;
                            }
                            return true;
                        }
                        i45 i45VarK = c45Var3.k(i4);
                        if (i45VarK != null) {
                            synchronized (i45VarK) {
                                i45VarK.e += j;
                                if (j > 0) {
                                    i45VarK.notifyAll();
                                }
                                g2b g2bVar5 = g2b.a;
                            }
                            return true;
                        }
                        return true;
                    } catch (Exception e) {
                        u35.a.getClass();
                        logger.fine(u35.b(true, i4, iO, 8, i3));
                        throw e;
                    }
                default:
                    hy0Var.skip(iO);
                    return true;
            }
        } catch (EOFException unused) {
        }
    }

    public final List<cu4> k(int i, int i2, int i3, int i4) throws IOException {
        b bVar = this.u;
        bVar.x = i;
        bVar.u = i;
        bVar.y = i2;
        bVar.v = i3;
        bVar.w = i4;
        s35.a aVar = this.v;
        ni8 ni8Var = aVar.c;
        ArrayList arrayList = aVar.b;
        while (!ni8Var.z()) {
            byte b2 = ni8Var.readByte();
            byte[] bArr = vtb.a;
            int i5 = b2 & MessagePack.Code.EXT_TIMESTAMP;
            if (i5 == 128) {
                o03.a("index == 0");
                return null;
            }
            if ((b2 & 128) == 128) {
                int iE = aVar.e(i5, 127);
                int i6 = iE - 1;
                if (i6 >= 0) {
                    cu4[] cu4VarArr = s35.a;
                    if (i6 <= cu4VarArr.length - 1) {
                        arrayList.add(cu4VarArr[i6]);
                    }
                }
                int length = aVar.e + 1 + (i6 - s35.a.length);
                if (length >= 0) {
                    cu4[] cu4VarArr2 = aVar.d;
                    if (length < cu4VarArr2.length) {
                        cu4 cu4Var = cu4VarArr2[length];
                        cu4Var.getClass();
                        arrayList.add(cu4Var);
                    }
                }
                o03.a(pp2.a(iE, "Header index too large "));
                return null;
            }
            if (i5 == 64) {
                cu4[] cu4VarArr3 = s35.a;
                g01 g01VarD = aVar.d();
                s35.a(g01VarD);
                aVar.c(new cu4(g01VarD, aVar.d()));
            } else if ((b2 & 64) == 64) {
                aVar.c(new cu4(aVar.b(aVar.e(i5, 63) - 1), aVar.d()));
            } else if ((b2 & 32) == 32) {
                int iE2 = aVar.e(i5, 31);
                aVar.a = iE2;
                if (iE2 < 0 || iE2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + aVar.a);
                }
                int i7 = aVar.g;
                if (iE2 < i7) {
                    if (iE2 == 0) {
                        cu4[] cu4VarArr4 = aVar.d;
                        gz3.m(0, cu4VarArr4.length, null, cu4VarArr4);
                        aVar.e = aVar.d.length - 1;
                        aVar.f = 0;
                        aVar.g = 0;
                    } else {
                        aVar.a(i7 - iE2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                cu4[] cu4VarArr5 = s35.a;
                g01 g01VarD2 = aVar.d();
                s35.a(g01VarD2);
                arrayList.add(new cu4(g01VarD2, aVar.d()));
            } else {
                arrayList.add(new cu4(aVar.b(aVar.e(i5, 15) - 1), aVar.d()));
            }
        }
        List<cu4> listT = th1.T(arrayList);
        arrayList.clear();
        return listT;
    }

    public final void m(c45.c cVar, int i) {
        hy0 hy0Var = this.t;
        hy0Var.readInt();
        hy0Var.readByte();
        byte[] bArr = vtb.a;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements kw9 {
        public final hy0 t;
        public int u;
        public int v;
        public int w;
        public int x;
        public int y;

        public b(hy0 hy0Var) {
            hy0Var.getClass();
            this.t = hy0Var;
        }

        @Override // defpackage.kw9
        public final long O(tx0 tx0Var, long j) throws IOException {
            int i;
            int i2;
            tx0Var.getClass();
            do {
                int i3 = this.x;
                hy0 hy0Var = this.t;
                if (i3 == 0) {
                    hy0Var.skip(this.y);
                    this.y = 0;
                    if ((this.v & 4) == 0) {
                        i = this.w;
                        int iO = vtb.o(hy0Var);
                        this.x = iO;
                        this.u = iO;
                        int i4 = hy0Var.readByte() & MessagePack.Code.EXT_TIMESTAMP;
                        this.v = hy0Var.readByte() & MessagePack.Code.EXT_TIMESTAMP;
                        Logger logger = h45.w;
                        if (logger.isLoggable(Level.FINE)) {
                            u35 u35Var = u35.a;
                            int i5 = this.w;
                            int i6 = this.u;
                            int i7 = this.v;
                            u35Var.getClass();
                            logger.fine(u35.b(true, i5, i6, i4, i7));
                        }
                        i2 = hy0Var.readInt() & Integer.MAX_VALUE;
                        this.w = i2;
                        if (i4 != 9) {
                            throw new IOException(i4 + " != TYPE_CONTINUATION");
                        }
                    }
                } else {
                    long jO = hy0Var.O(tx0Var, Math.min(j, i3));
                    if (jO != -1) {
                        this.x -= (int) jO;
                        return jO;
                    }
                }
                return -1L;
            } while (i2 == i);
            o03.a("TYPE_CONTINUATION streamId changed");
            return 0L;
        }

        @Override // defpackage.kw9
        public final voa timeout() {
            return this.t.timeout();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }
}
