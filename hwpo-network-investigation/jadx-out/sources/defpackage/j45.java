package defpackage;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class j45 implements Closeable {
    public static final Logger y = Logger.getLogger(u35.class.getName());
    public final fy0 t;
    public final tx0 u;
    public int v;
    public boolean w;
    public final s35.b x;

    public j45(fy0 fy0Var) {
        fy0Var.getClass();
        this.t = fy0Var;
        tx0 tx0Var = new tx0();
        this.u = tx0Var;
        this.v = 16384;
        this.x = new s35.b(tx0Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.w = true;
            this.t.close();
            g2b g2bVar = g2b.a;
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.w) {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
            this.t.flush();
            g2b g2bVar = g2b.a;
        }
    }

    public final void h(ok9 ok9Var) {
        ok9Var.getClass();
        synchronized (this) {
            try {
                if (this.w) {
                    throw new IOException(MetricTracker.Action.CLOSED);
                }
                int i = this.v;
                int i2 = ok9Var.a;
                if ((i2 & 32) != 0) {
                    i = ok9Var.b[5];
                }
                this.v = i;
                if (((i2 & 2) != 0 ? ok9Var.b[1] : -1) != -1) {
                    s35.b bVar = this.x;
                    int i3 = (i2 & 2) != 0 ? ok9Var.b[1] : -1;
                    bVar.getClass();
                    int iMin = Math.min(i3, 16384);
                    int i4 = bVar.d;
                    if (i4 != iMin) {
                        if (iMin < i4) {
                            bVar.b = Math.min(bVar.b, iMin);
                        }
                        bVar.c = true;
                        bVar.d = iMin;
                        int i5 = bVar.h;
                        if (iMin < i5) {
                            if (iMin == 0) {
                                cu4[] cu4VarArr = bVar.e;
                                gz3.m(0, cu4VarArr.length, null, cu4VarArr);
                                bVar.f = bVar.e.length - 1;
                                bVar.g = 0;
                                bVar.h = 0;
                            } else {
                                bVar.a(i5 - iMin);
                            }
                        }
                    }
                }
                m(0, 0, 4, 1);
                this.t.flush();
                g2b g2bVar = g2b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(boolean z, int i, tx0 tx0Var, int i2) {
        synchronized (this) {
            if (this.w) {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
            m(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                fy0 fy0Var = this.t;
                tx0Var.getClass();
                fy0Var.i0(tx0Var, i2);
            }
            g2b g2bVar = g2b.a;
        }
    }

    public final void m(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            Level level = Level.FINE;
            Logger logger = y;
            if (logger.isLoggable(level)) {
                u35.a.getClass();
                logger.fine(u35.b(false, i, i2, i3, i4));
            }
        }
        if (i2 > this.v) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.v + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            ca0.a(pp2.a(i, "reserved bit set: "));
            return;
        }
        byte[] bArr = vtb.a;
        fy0 fy0Var = this.t;
        fy0Var.getClass();
        fy0Var.writeByte((i2 >>> 16) & 255);
        fy0Var.writeByte((i2 >>> 8) & 255);
        fy0Var.writeByte(i2 & 255);
        fy0Var.writeByte(i3 & 255);
        fy0Var.writeByte(i4 & 255);
        fy0Var.writeInt(i & Integer.MAX_VALUE);
    }

    public final void p(int i, ul3 ul3Var, byte[] bArr) {
        synchronized (this) {
            if (this.w) {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
            if (ul3Var.t == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            m(0, bArr.length + 8, 7, 0);
            this.t.writeInt(i);
            this.t.writeInt(ul3Var.t);
            if (bArr.length != 0) {
                this.t.write(bArr);
            }
            this.t.flush();
            g2b g2bVar = g2b.a;
        }
    }

    public final void t(boolean z, int i, ArrayList arrayList) {
        synchronized (this) {
            if (this.w) {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
            this.x.d(arrayList);
            long j = this.u.u;
            long jMin = Math.min(this.v, j);
            int i2 = j == jMin ? 4 : 0;
            if (z) {
                i2 |= 1;
            }
            m(i, (int) jMin, 1, i2);
            this.t.i0(this.u, jMin);
            if (j > jMin) {
                long j2 = j - jMin;
                while (j2 > 0) {
                    long jMin2 = Math.min(this.v, j2);
                    j2 -= jMin2;
                    m(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                    this.t.i0(this.u, jMin2);
                }
            }
            g2b g2bVar = g2b.a;
        }
    }

    public final void u(int i, boolean z, int i2) {
        synchronized (this) {
            if (this.w) {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
            m(0, 8, 6, z ? 1 : 0);
            this.t.writeInt(i);
            this.t.writeInt(i2);
            this.t.flush();
            g2b g2bVar = g2b.a;
        }
    }

    public final void v(int i, ul3 ul3Var) {
        synchronized (this) {
            if (this.w) {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
            if (ul3Var.t == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            m(i, 4, 3, 0);
            this.t.writeInt(ul3Var.t);
            this.t.flush();
            g2b g2bVar = g2b.a;
        }
    }

    public final void y(int i, long j) {
        synchronized (this) {
            try {
                if (this.w) {
                    throw new IOException(MetricTracker.Action.CLOSED);
                }
                if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
                Logger logger = y;
                if (logger.isLoggable(Level.FINE)) {
                    u35.a.getClass();
                    logger.fine(u35.c(i, 4, j, false));
                }
                m(i, 4, 8, 0);
                this.t.writeInt((int) j);
                this.t.flush();
                g2b g2bVar = g2b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
