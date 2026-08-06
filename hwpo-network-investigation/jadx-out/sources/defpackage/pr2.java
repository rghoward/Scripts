package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import com.intercom.twig.BuildConfig;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pr2 implements jz4, yb6.a<vt7<gz4>> {
    public static final o03 M = new o03();
    public Handler A;
    public HlsMediaSource B;
    public fz4 C;
    public ut7 D;
    public k95<kz4> E;
    public k95<kz4> F;
    public k95<kz4> G;
    public k95<kz4> H;
    public Uri I;
    public dz4 J;
    public boolean K;
    public final mr2 t;
    public final iz4 u;
    public final qb6 v;
    public jq6.a y;
    public yb6 z;
    public final CopyOnWriteArrayList<jz4.a> x = new CopyOnWriteArrayList<>();
    public final HashMap<Uri, c> w = new HashMap<>();
    public long L = -9223372036854775807L;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements jz4.a {
        public a() {
        }

        @Override // jz4.a
        public final void a() {
            pr2.this.x.remove(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // jz4.a
        public final boolean b(Uri uri, qb6.c cVar, boolean z) {
            c cVar2;
            pr2 pr2Var = pr2.this;
            HashMap<Uri, c> map = pr2Var.w;
            if (pr2Var.J == null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                c cVar3 = map.get(uri);
                cVar3.getClass();
                kz4 kz4Var = cVar3.a;
                int size = kz4Var.b.size();
                w2b it = q95.p(kz4Var.b.values()).iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (pr2Var.d((Uri) it.next(), jElapsedRealtime)) {
                        i++;
                    }
                }
                int size2 = pr2Var.E.size();
                k95.b bVarListIterator = pr2Var.E.listIterator(0);
                int i2 = 0;
                while (bVarListIterator.hasNext()) {
                    if (pr2Var.a((kz4) bVarListIterator.next(), jElapsedRealtime)) {
                        i2++;
                    }
                }
                qb6.b bVarB = pr2Var.v.b(new qb6.a(size, i, size2, i2), cVar);
                if (bVarB != null && (cVar2 = map.get(uri)) != null) {
                    return c.c(cVar2, uri, bVarB.b);
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class b implements yb6.a<vt7<gz4>> {
        public long A;
        public long B;
        public boolean C;
        public IOException D;
        public boolean E;
        public final Uri t;
        public final String u;
        public final yb6 v = new yb6("DefaultHlsPlaylistTracker:MediaPlaylist");
        public final if2 w;
        public dz4 x;
        public long y;
        public long z;

        public b(Uri uri, String str) {
            this.t = uri;
            this.u = str;
            this.w = pr2.this.t.a.a();
        }

        public final Uri a() {
            dz4 dz4Var = this.x;
            Uri uri = this.t;
            if (dz4Var != null) {
                dz4.g gVar = dz4Var.v;
                if (gVar.a != -9223372036854775807L || gVar.e) {
                    Uri.Builder builderBuildUpon = uri.buildUpon();
                    dz4 dz4Var2 = this.x;
                    if (dz4Var2.v.e) {
                        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(dz4Var2.k + ((long) dz4Var2.r.size())));
                        dz4 dz4Var3 = this.x;
                        if (dz4Var3.n != -9223372036854775807L) {
                            k95 k95Var = dz4Var3.s;
                            int size = k95Var.size();
                            if (!k95Var.isEmpty() && ((dz4.c) nr1.b(k95Var)).F) {
                                size--;
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    dz4.g gVar2 = this.x.v;
                    if (gVar2.a != -9223372036854775807L) {
                        builderBuildUpon.appendQueryParameter("_HLS_skip", gVar2.b ? "v2" : "YES");
                    }
                    return builderBuildUpon.build();
                }
            }
            return uri;
        }

        @Override // yb6.a
        public final void b(yb6.d dVar, long j, long j2, boolean z) {
            vt7 vt7Var = (vt7) dVar;
            long j3 = vt7Var.a;
            of2 of2Var = vt7Var.b;
            c1a c1aVar = vt7Var.d;
            rb6 rb6Var = new rb6(of2Var, c1aVar.c, c1aVar.d, j, j2, c1aVar.b);
            pr2 pr2Var = pr2.this;
            pr2Var.v.getClass();
            pr2Var.y.b(rb6Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public final void c(Uri uri) {
            pr2 pr2Var = pr2.this;
            vt7.a<gz4> aVarA = pr2Var.u.a(pr2Var.C, this.x);
            Map map = Collections.EMPTY_MAP;
            xl7.n(uri, "The uri must be set.");
            vt7 vt7Var = new vt7(this.w, new of2(uri, 1, null, map, 0L, -1L, 1), aVarA);
            this.v.d(vt7Var, this, pr2Var.v.c(vt7Var.c));
        }

        public final void d(Uri uri) {
            this.B = 0L;
            if (this.C) {
                return;
            }
            yb6 yb6Var = this.v;
            if (yb6Var.b() || yb6Var.c != null) {
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.A;
            if (jElapsedRealtime >= j) {
                c(uri);
            } else {
                this.C = true;
                pr2.this.A.postDelayed(new ez(1, this, uri), j - jElapsedRealtime);
            }
        }

        /* JADX WARN: Code duplicated, block: B:101:0x024e  */
        /* JADX WARN: Code duplicated, block: B:102:0x0250 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:103:0x0252  */
        /* JADX WARN: Code duplicated, block: B:105:0x025d  */
        /* JADX WARN: Code duplicated, block: B:106:0x0261  */
        /* JADX WARN: Code duplicated, block: B:109:0x0275  */
        /* JADX WARN: Code duplicated, block: B:111:0x027d  */
        /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:24:0x0057  */
        /* JADX WARN: Code duplicated, block: B:26:0x005b  */
        /* JADX WARN: Code duplicated, block: B:28:0x005f  */
        /* JADX WARN: Code duplicated, block: B:29:0x0067  */
        /* JADX WARN: Code duplicated, block: B:31:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:32:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:34:0x00d9  */
        /* JADX WARN: Code duplicated, block: B:36:0x00de  */
        /* JADX WARN: Code duplicated, block: B:38:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:39:0x00e5  */
        /* JADX WARN: Code duplicated, block: B:41:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:42:0x00ec  */
        /* JADX WARN: Code duplicated, block: B:44:0x0103  */
        /* JADX WARN: Code duplicated, block: B:45:0x010a  */
        /* JADX WARN: Code duplicated, block: B:47:0x010d  */
        /* JADX WARN: Code duplicated, block: B:49:0x0112  */
        /* JADX WARN: Code duplicated, block: B:51:0x0119  */
        /* JADX WARN: Code duplicated, block: B:55:0x0122  */
        /* JADX WARN: Code duplicated, block: B:56:0x012a  */
        /* JADX WARN: Code duplicated, block: B:58:0x012e  */
        /* JADX WARN: Code duplicated, block: B:59:0x0131  */
        /* JADX WARN: Code duplicated, block: B:61:0x0134  */
        /* JADX WARN: Code duplicated, block: B:62:0x0136  */
        /* JADX WARN: Code duplicated, block: B:64:0x0142  */
        /* JADX WARN: Code duplicated, block: B:65:0x0149  */
        /* JADX WARN: Code duplicated, block: B:67:0x014c  */
        /* JADX WARN: Code duplicated, block: B:72:0x01af  */
        /* JADX WARN: Code duplicated, block: B:74:0x01bb  */
        /* JADX WARN: Code duplicated, block: B:76:0x01bf  */
        /* JADX WARN: Code duplicated, block: B:81:0x01da A[LOOP:0: B:79:0x01d4->B:81:0x01da, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:82:0x01e4  */
        /* JADX WARN: Code duplicated, block: B:84:0x01e8  */
        /* JADX WARN: Code duplicated, block: B:86:0x01fa  */
        /* JADX WARN: Code duplicated, block: B:87:0x0202  */
        /* JADX WARN: Code duplicated, block: B:89:0x0215  */
        /* JADX WARN: Code duplicated, block: B:91:0x021c  */
        /* JADX WARN: Code duplicated, block: B:93:0x0220  */
        /* JADX WARN: Code duplicated, block: B:96:0x0233 A[LOOP:1: B:94:0x022d->B:96:0x0233, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:99:0x0249 A[DONT_INVERT] */
        /* JADX WARN: Multi-variable type inference failed */
        public final void e(dz4 dz4Var, rb6 rb6Var) {
            boolean z;
            long j;
            k95 k95Var;
            long j2;
            boolean z2;
            dz4 dz4Var2;
            long j3;
            long j4;
            k95 k95Var2;
            int size;
            int i;
            dz4.e eVar;
            long j5;
            long j6;
            long j7;
            dz4 dz4Var3;
            int i2;
            int i3;
            k95 k95Var3;
            dz4.e eVar2;
            int i4;
            dz4 dz4Var4;
            IOException iOException;
            Uri uri;
            long size2;
            dz4 dz4Var5;
            IOException cVar;
            boolean z3;
            qb6.c cVar2;
            Iterator<jz4.a> it;
            dz4 dz4Var6;
            dz4.g gVar;
            long j8;
            long j9;
            Iterator<jz4.a> it2;
            int size3;
            int size4;
            int size5;
            dz4 dz4Var7 = this.x;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.y = jElapsedRealtime;
            pr2 pr2Var = pr2.this;
            CopyOnWriteArrayList<jz4.a> copyOnWriteArrayList = pr2Var.x;
            if (dz4Var7 != null) {
                long j10 = dz4Var.k;
                long j11 = dz4Var7.k;
                z = j10 > j11 || (j10 >= j11 && ((size3 = dz4Var.r.size() - dz4Var7.r.size()) == 0 ? (size4 = dz4Var.s.size()) > (size5 = dz4Var7.s.size()) || (size4 == size5 && dz4Var.o && !dz4Var7.o) : size3 > 0));
                j = dz4Var.k;
                k95Var = dz4Var.r;
                j2 = 0;
                if (z) {
                    copyOnWriteArrayList = copyOnWriteArrayList;
                    z2 = true;
                    if (dz4Var.p) {
                        j6 = dz4Var.h;
                    } else {
                        dz4Var2 = pr2Var.J;
                        if (dz4Var2 != null) {
                            j3 = dz4Var2.h;
                        } else {
                            j3 = 0;
                        }
                        if (dz4Var7 == null) {
                            long j12 = dz4Var7.h;
                            j4 = dz4Var7.k;
                            k95Var2 = dz4Var7.r;
                            size = k95Var2.size();
                            i = (int) (j - j4);
                            if (i < k95Var2.size()) {
                                eVar = (dz4.e) k95Var2.get(i);
                            } else {
                                eVar = null;
                            }
                            if (eVar != null) {
                                j5 = eVar.x;
                            } else {
                                if (size == j - j4) {
                                    j5 = dz4Var7.u;
                                }
                                if (dz4Var.i) {
                                    i4 = dz4Var.j;
                                } else {
                                    dz4Var3 = pr2Var.J;
                                    if (dz4Var3 != null) {
                                        i2 = dz4Var3.j;
                                    } else {
                                        i2 = 0;
                                    }
                                    if (dz4Var7 == null) {
                                        i3 = (int) (j - dz4Var7.k);
                                        k95Var3 = dz4Var7.r;
                                        if (i3 < k95Var3.size()) {
                                            eVar2 = (dz4.e) k95Var3.get(i3);
                                        } else {
                                            eVar2 = null;
                                        }
                                        if (eVar2 != null) {
                                            i2 = (dz4Var7.j + eVar2.w) - ((dz4.e) k95Var.get(0)).w;
                                        }
                                    }
                                    i4 = i2;
                                }
                                iOException = null;
                                dz4Var4 = new dz4(dz4Var.d, dz4Var.a, dz4Var.b, dz4Var.e, dz4Var.g, j7, true, i4, dz4Var.k, dz4Var.l, dz4Var.m, dz4Var.n, dz4Var.c, dz4Var.o, dz4Var.p, dz4Var.q, k95Var, dz4Var.s, dz4Var.v, dz4Var.t, dz4Var.w, dz4Var.x);
                            }
                            j6 = j12 + j5;
                        }
                        j7 = j3;
                        if (dz4Var.i) {
                            i4 = dz4Var.j;
                        } else {
                            dz4Var3 = pr2Var.J;
                            if (dz4Var3 != null) {
                                i2 = dz4Var3.j;
                            } else {
                                i2 = 0;
                            }
                            if (dz4Var7 == null) {
                                i3 = (int) (j - dz4Var7.k);
                                k95Var3 = dz4Var7.r;
                                if (i3 < k95Var3.size()) {
                                    eVar2 = (dz4.e) k95Var3.get(i3);
                                } else {
                                    eVar2 = null;
                                }
                                if (eVar2 != null) {
                                    i2 = (dz4Var7.j + eVar2.w) - ((dz4.e) k95Var.get(0)).w;
                                }
                            }
                            i4 = i2;
                        }
                        iOException = null;
                        dz4Var4 = new dz4(dz4Var.d, dz4Var.a, dz4Var.b, dz4Var.e, dz4Var.g, j7, true, i4, dz4Var.k, dz4Var.l, dz4Var.m, dz4Var.n, dz4Var.c, dz4Var.o, dz4Var.p, dz4Var.q, k95Var, dz4Var.s, dz4Var.v, dz4Var.t, dz4Var.w, dz4Var.x);
                    }
                    j7 = j6;
                    if (dz4Var.i) {
                        i4 = dz4Var.j;
                    } else {
                        dz4Var3 = pr2Var.J;
                        if (dz4Var3 != null) {
                            i2 = dz4Var3.j;
                        } else {
                            i2 = 0;
                        }
                        if (dz4Var7 == null) {
                            i3 = (int) (j - dz4Var7.k);
                            k95Var3 = dz4Var7.r;
                            if (i3 < k95Var3.size()) {
                                eVar2 = (dz4.e) k95Var3.get(i3);
                            } else {
                                eVar2 = null;
                            }
                            if (eVar2 != null) {
                                i2 = (dz4Var7.j + eVar2.w) - ((dz4.e) k95Var.get(0)).w;
                            }
                        }
                        i4 = i2;
                    }
                    iOException = null;
                    dz4Var4 = new dz4(dz4Var.d, dz4Var.a, dz4Var.b, dz4Var.e, dz4Var.g, j7, true, i4, dz4Var.k, dz4Var.l, dz4Var.m, dz4Var.n, dz4Var.c, dz4Var.o, dz4Var.p, dz4Var.q, k95Var, dz4Var.s, dz4Var.v, dz4Var.t, dz4Var.w, dz4Var.x);
                } else {
                    if (dz4Var.o) {
                        z2 = true;
                        dz4Var4 = dz4Var7;
                    } else if (dz4Var7.o) {
                        dz4Var4 = dz4Var7;
                        copyOnWriteArrayList = copyOnWriteArrayList;
                        iOException = null;
                        z2 = true;
                    } else {
                        z2 = true;
                        dz4Var4 = new dz4(dz4Var7.d, dz4Var7.a, dz4Var7.b, dz4Var7.e, dz4Var7.g, dz4Var7.h, dz4Var7.i, dz4Var7.j, dz4Var7.k, dz4Var7.l, dz4Var7.m, dz4Var7.n, dz4Var7.c, true, dz4Var7.p, dz4Var7.q, dz4Var7.r, dz4Var7.s, dz4Var7.v, dz4Var7.t, dz4Var7.w, dz4Var7.x);
                    }
                    iOException = null;
                }
                this.x = dz4Var4;
                uri = this.t;
                if (dz4Var4 != dz4Var7) {
                    this.D = iOException;
                    this.z = jElapsedRealtime;
                    if (uri.equals(pr2Var.I)) {
                        if (pr2Var.J == null) {
                            pr2Var.K = !dz4Var4.o;
                            pr2Var.L = dz4Var4.h;
                        }
                        pr2Var.J = dz4Var4;
                        pr2Var.B.v(dz4Var4);
                    }
                    it2 = copyOnWriteArrayList.iterator();
                    while (it2.hasNext()) {
                        it2.next().a();
                    }
                } else if (!dz4Var4.o) {
                    size2 = dz4Var.k + ((long) dz4Var.r.size());
                    dz4Var5 = this.x;
                    if (size2 < dz4Var5.k) {
                        cVar = new jz4.b();
                        z3 = z2;
                    } else {
                        if (jElapsedRealtime - this.z > n6b.Z(dz4Var5.m) * 3.5d) {
                            cVar = new jz4.c();
                        } else {
                            cVar = iOException;
                        }
                        z3 = false;
                    }
                    if (cVar != null) {
                        this.D = cVar;
                        cVar2 = new qb6.c(cVar, z2 ? 1 : 0);
                        it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            it.next().b(uri, cVar2, z3);
                        }
                    }
                }
                dz4Var6 = this.x;
                gVar = dz4Var6.v;
                j8 = dz4Var6.m;
                if (!gVar.e) {
                    if (dz4Var6 == dz4Var7) {
                        j9 = dz4Var6.n;
                        if (j9 != -9223372036854775807L) {
                            j2 = j9 / 2;
                        } else {
                            j8 /= 2;
                        }
                    }
                    this.A = (n6b.Z(j2) + jElapsedRealtime) - rb6Var.b;
                    if (this.x.o) {
                    }
                    if (!uri.equals(pr2Var.I) || this.E) {
                        d(a());
                    }
                    return;
                }
                if (dz4Var6 == dz4Var7) {
                    j8 /= 2;
                }
                j2 = j8;
                this.A = (n6b.Z(j2) + jElapsedRealtime) - rb6Var.b;
                if (this.x.o) {
                    if (uri.equals(pr2Var.I)) {
                    }
                    d(a());
                }
            }
            dz4Var.getClass();
            j = dz4Var.k;
            k95Var = dz4Var.r;
            j2 = 0;
            if (z) {
                if (dz4Var.o) {
                    z2 = true;
                    dz4Var4 = dz4Var7;
                } else if (dz4Var7.o) {
                    dz4Var4 = dz4Var7;
                    copyOnWriteArrayList = copyOnWriteArrayList;
                    iOException = null;
                    z2 = true;
                } else {
                    z2 = true;
                    dz4Var4 = new dz4(dz4Var7.d, dz4Var7.a, dz4Var7.b, dz4Var7.e, dz4Var7.g, dz4Var7.h, dz4Var7.i, dz4Var7.j, dz4Var7.k, dz4Var7.l, dz4Var7.m, dz4Var7.n, dz4Var7.c, true, dz4Var7.p, dz4Var7.q, dz4Var7.r, dz4Var7.s, dz4Var7.v, dz4Var7.t, dz4Var7.w, dz4Var7.x);
                }
                iOException = null;
            } else {
                copyOnWriteArrayList = copyOnWriteArrayList;
                z2 = true;
                if (dz4Var.p) {
                    j6 = dz4Var.h;
                } else {
                    dz4Var2 = pr2Var.J;
                    if (dz4Var2 != null) {
                        j3 = dz4Var2.h;
                    } else {
                        j3 = 0;
                    }
                    if (dz4Var7 == null) {
                        long j13 = dz4Var7.h;
                        j4 = dz4Var7.k;
                        k95Var2 = dz4Var7.r;
                        size = k95Var2.size();
                        i = (int) (j - j4);
                        if (i < k95Var2.size()) {
                            eVar = (dz4.e) k95Var2.get(i);
                        } else {
                            eVar = null;
                        }
                        if (eVar != null) {
                            j5 = eVar.x;
                        } else {
                            if (size == j - j4) {
                                j5 = dz4Var7.u;
                            }
                            if (dz4Var.i) {
                                i4 = dz4Var.j;
                            } else {
                                dz4Var3 = pr2Var.J;
                                if (dz4Var3 != null) {
                                    i2 = dz4Var3.j;
                                } else {
                                    i2 = 0;
                                }
                                if (dz4Var7 == null) {
                                    i3 = (int) (j - dz4Var7.k);
                                    k95Var3 = dz4Var7.r;
                                    if (i3 < k95Var3.size()) {
                                        eVar2 = (dz4.e) k95Var3.get(i3);
                                    } else {
                                        eVar2 = null;
                                    }
                                    if (eVar2 != null) {
                                        i2 = (dz4Var7.j + eVar2.w) - ((dz4.e) k95Var.get(0)).w;
                                    }
                                }
                                i4 = i2;
                            }
                            iOException = null;
                            dz4Var4 = new dz4(dz4Var.d, dz4Var.a, dz4Var.b, dz4Var.e, dz4Var.g, j7, true, i4, dz4Var.k, dz4Var.l, dz4Var.m, dz4Var.n, dz4Var.c, dz4Var.o, dz4Var.p, dz4Var.q, k95Var, dz4Var.s, dz4Var.v, dz4Var.t, dz4Var.w, dz4Var.x);
                        }
                        j6 = j13 + j5;
                    }
                    j7 = j3;
                    if (dz4Var.i) {
                        i4 = dz4Var.j;
                    } else {
                        dz4Var3 = pr2Var.J;
                        if (dz4Var3 != null) {
                            i2 = dz4Var3.j;
                        } else {
                            i2 = 0;
                        }
                        if (dz4Var7 == null) {
                            i3 = (int) (j - dz4Var7.k);
                            k95Var3 = dz4Var7.r;
                            if (i3 < k95Var3.size()) {
                                eVar2 = (dz4.e) k95Var3.get(i3);
                            } else {
                                eVar2 = null;
                            }
                            if (eVar2 != null) {
                                i2 = (dz4Var7.j + eVar2.w) - ((dz4.e) k95Var.get(0)).w;
                            }
                        }
                        i4 = i2;
                    }
                    iOException = null;
                    dz4Var4 = new dz4(dz4Var.d, dz4Var.a, dz4Var.b, dz4Var.e, dz4Var.g, j7, true, i4, dz4Var.k, dz4Var.l, dz4Var.m, dz4Var.n, dz4Var.c, dz4Var.o, dz4Var.p, dz4Var.q, k95Var, dz4Var.s, dz4Var.v, dz4Var.t, dz4Var.w, dz4Var.x);
                }
                j7 = j6;
                if (dz4Var.i) {
                    i4 = dz4Var.j;
                } else {
                    dz4Var3 = pr2Var.J;
                    if (dz4Var3 != null) {
                        i2 = dz4Var3.j;
                    } else {
                        i2 = 0;
                    }
                    if (dz4Var7 == null) {
                        i3 = (int) (j - dz4Var7.k);
                        k95Var3 = dz4Var7.r;
                        if (i3 < k95Var3.size()) {
                            eVar2 = (dz4.e) k95Var3.get(i3);
                        } else {
                            eVar2 = null;
                        }
                        if (eVar2 != null) {
                            i2 = (dz4Var7.j + eVar2.w) - ((dz4.e) k95Var.get(0)).w;
                        }
                    }
                    i4 = i2;
                }
                iOException = null;
                dz4Var4 = new dz4(dz4Var.d, dz4Var.a, dz4Var.b, dz4Var.e, dz4Var.g, j7, true, i4, dz4Var.k, dz4Var.l, dz4Var.m, dz4Var.n, dz4Var.c, dz4Var.o, dz4Var.p, dz4Var.q, k95Var, dz4Var.s, dz4Var.v, dz4Var.t, dz4Var.w, dz4Var.x);
            }
            this.x = dz4Var4;
            uri = this.t;
            if (dz4Var4 != dz4Var7) {
                this.D = iOException;
                this.z = jElapsedRealtime;
                if (uri.equals(pr2Var.I)) {
                    if (pr2Var.J == null) {
                        pr2Var.K = !dz4Var4.o;
                        pr2Var.L = dz4Var4.h;
                    }
                    pr2Var.J = dz4Var4;
                    pr2Var.B.v(dz4Var4);
                }
                it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().a();
                }
            } else if (!dz4Var4.o) {
                size2 = dz4Var.k + ((long) dz4Var.r.size());
                dz4Var5 = this.x;
                if (size2 < dz4Var5.k) {
                    cVar = new jz4.b();
                    z3 = z2;
                } else {
                    if (jElapsedRealtime - this.z > n6b.Z(dz4Var5.m) * 3.5d) {
                        cVar = new jz4.c();
                    } else {
                        cVar = iOException;
                    }
                    z3 = false;
                }
                if (cVar != null) {
                    this.D = cVar;
                    cVar2 = new qb6.c(cVar, z2 ? 1 : 0);
                    it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        it.next().b(uri, cVar2, z3);
                    }
                }
            }
            dz4Var6 = this.x;
            gVar = dz4Var6.v;
            j8 = dz4Var6.m;
            if (!gVar.e) {
                if (dz4Var6 == dz4Var7) {
                    j9 = dz4Var6.n;
                    if (j9 != -9223372036854775807L) {
                        j2 = j9 / 2;
                    } else {
                        j8 /= 2;
                    }
                }
                this.A = (n6b.Z(j2) + jElapsedRealtime) - rb6Var.b;
                if (this.x.o) {
                    if (uri.equals(pr2Var.I)) {
                    }
                    d(a());
                }
            }
            if (dz4Var6 == dz4Var7) {
                j8 /= 2;
            }
            j2 = j8;
            this.A = (n6b.Z(j2) + jElapsedRealtime) - rb6Var.b;
            if (this.x.o) {
                if (uri.equals(pr2Var.I)) {
                }
                d(a());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // yb6.a
        public final void h(yb6.d dVar, long j, long j2) {
            vt7 vt7Var = (vt7) dVar;
            gz4 gz4Var = (gz4) vt7Var.f;
            of2 of2Var = vt7Var.b;
            c1a c1aVar = vt7Var.d;
            rb6 rb6Var = new rb6(of2Var, c1aVar.c, c1aVar.d, j, j2, c1aVar.b);
            if (gz4Var instanceof dz4) {
                e((dz4) gz4Var, rb6Var);
                pr2.this.y.c(rb6Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
            } else {
                ut7 ut7VarB = ut7.b("Loaded playlist has unexpected type.");
                this.D = ut7VarB;
                pr2.this.y.d(rb6Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, ut7VarB, true);
            }
            pr2.this.v.getClass();
        }

        @Override // yb6.a
        public final void o(yb6.d dVar, long j, long j2, int i) {
            rb6 rb6Var;
            vt7 vt7Var = (vt7) dVar;
            if (i == 0) {
                long j3 = vt7Var.a;
                rb6Var = new rb6(vt7Var.b, j);
            } else {
                long j4 = vt7Var.a;
                of2 of2Var = vt7Var.b;
                c1a c1aVar = vt7Var.d;
                rb6Var = new rb6(of2Var, c1aVar.c, c1aVar.d, j, j2, c1aVar.b);
            }
            pr2.this.y.e(rb6Var, vt7Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
        }

        @Override // yb6.a
        public final yb6.b u(yb6.d dVar, long j, long j2, IOException iOException, int i) {
            vt7 vt7Var = (vt7) dVar;
            long j3 = vt7Var.a;
            int i2 = vt7Var.c;
            of2 of2Var = vt7Var.b;
            c1a c1aVar = vt7Var.d;
            Uri uri = c1aVar.c;
            rb6 rb6Var = new rb6(of2Var, uri, c1aVar.d, j, j2, c1aVar.b);
            boolean z = uri.getQueryParameter("_HLS_msn") != null;
            boolean z2 = iOException instanceof hz4.a;
            yb6.b bVar = yb6.e;
            Uri uri2 = this.t;
            pr2 pr2Var = pr2.this;
            if (z || z2) {
                int i3 = iOException instanceof n45 ? ((n45) iOException).v : Integer.MAX_VALUE;
                if (z2 || i3 == 400 || i3 == 503) {
                    this.A = SystemClock.elapsedRealtime();
                    d(uri2);
                    jq6.a aVar = pr2Var.y;
                    String str = n6b.a;
                    aVar.d(rb6Var, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, true);
                    return bVar;
                }
            }
            qb6.c cVar = new qb6.c(iOException, i);
            Iterator<jz4.a> it = pr2Var.x.iterator();
            boolean z3 = false;
            while (it.hasNext()) {
                z3 |= !it.next().b(uri2, cVar, false);
            }
            qb6 qb6Var = pr2Var.v;
            if (z3) {
                long jA = qb6Var.a(cVar);
                bVar = jA != -9223372036854775807L ? new yb6.b(0, jA) : yb6.f;
            }
            int i4 = bVar.a;
            boolean z4 = i4 == 0 || i4 == 1;
            pr2Var.y.d(rb6Var, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, !z4);
            if (!z4) {
                qb6Var.getClass();
            }
            return bVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class c {
        public final kz4 a;
        public final HashMap b;

        public c(kz4 kz4Var) {
            this.a = kz4Var;
            HashMap map = new HashMap();
            w2b it = q95.p(kz4Var.b.keySet()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Uri uri = kz4Var.b.get(str);
                uri.getClass();
                map.put(uri, pr2.this.new b(uri, str));
            }
            this.b = map;
        }

        public static dz4 a(c cVar, Uri uri) {
            HashMap map = cVar.b;
            xl7.r(map.containsKey(uri));
            b bVar = (b) map.get(uri);
            bVar.getClass();
            return bVar.x;
        }

        public static void b(c cVar, Uri uri, boolean z) {
            HashMap map = cVar.b;
            xl7.r(map.containsKey(uri));
            b bVar = (b) map.get(uri);
            bVar.getClass();
            bVar.d(z ? bVar.a() : bVar.t);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00db A[RETURN] */
        public static boolean c(c cVar, Uri uri, long j) {
            boolean z;
            HashMap map = cVar.b;
            xl7.r(map.containsKey(uri));
            b bVar = (b) map.get(uri);
            bVar.getClass();
            bVar.B = SystemClock.elapsedRealtime() + j;
            pr2 pr2Var = pr2.this;
            kz4 kz4Var = cVar.a;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            for (b bVar2 : map.values()) {
                if (!bVar2.u.equals(kz4Var.d) && jElapsedRealtime > bVar2.B) {
                    Uri uriC = kz4Var.c();
                    String str = bVar2.u;
                    xl7.r(kz4Var.b.containsKey(str));
                    kz4Var.d = str;
                    if (uriC.equals(pr2Var.I)) {
                        pr2Var.v(bVar2.t);
                    }
                    b bVar3 = (b) map.get(uriC);
                    bVar3.getClass();
                    bVar2.E = bVar3.E;
                    bVar3.E = false;
                    return true;
                }
            }
            Uri uri2 = pr2Var.I;
            if (uri2 == null || uri.equals(uri2)) {
                k95<kz4> k95Var = pr2Var.E;
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                for (int i = 0; i < k95Var.size(); i++) {
                    Uri uriC2 = k95Var.get(i).c();
                    c cVar2 = pr2Var.w.get(uriC2);
                    cVar2.getClass();
                    HashMap map2 = cVar2.b;
                    xl7.r(map2.containsKey(uriC2));
                    b bVar4 = (b) map2.get(uriC2);
                    bVar4.getClass();
                    if (jElapsedRealtime2 > bVar4.B) {
                        pr2Var.I = uriC2;
                        Uri uriT = pr2Var.t(uriC2);
                        xl7.r(map2.containsKey(uriC2));
                        b bVar5 = (b) map2.get(uriC2);
                        bVar5.getClass();
                        bVar5.d(uriT);
                        z = true;
                        if (z) {
                            return false;
                        }
                    }
                }
                z = false;
                if (z) {
                    return false;
                }
            }
            return true;
        }
    }

    public pr2(mr2 mr2Var, es2 es2Var, iz4 iz4Var) {
        this.t = mr2Var;
        this.u = iz4Var;
        this.v = es2Var;
    }

    @Override // defpackage.jz4
    public final boolean a(kz4 kz4Var, long j) {
        c cVar = this.w.get(kz4Var.c());
        if (cVar == null) {
            return false;
        }
        Iterator it = cVar.b.values().iterator();
        boolean z = true;
        while (it.hasNext()) {
            z &= j <= ((b) it.next()).B;
        }
        return z;
    }

    @Override // yb6.a
    public final void b(yb6.d dVar, long j, long j2, boolean z) {
        vt7 vt7Var = (vt7) dVar;
        long j3 = vt7Var.a;
        of2 of2Var = vt7Var.b;
        c1a c1aVar = vt7Var.d;
        rb6 rb6Var = new rb6(of2Var, c1aVar.c, c1aVar.d, j, j2, c1aVar.b);
        this.v.getClass();
        this.y.b(rb6Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // defpackage.jz4
    public final boolean c(Uri uri) {
        int i;
        c cVar = this.w.get(uri);
        if (cVar == null) {
            return false;
        }
        HashMap map = cVar.b;
        xl7.r(map.containsKey(uri));
        b bVar = (b) map.get(uri);
        bVar.getClass();
        if (bVar.x == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(AudioConstants.TRANSCRIPTION_TIMEOUT_MS, n6b.Z(bVar.x.u));
        dz4 dz4Var = bVar.x;
        return dz4Var.o || (i = dz4Var.d) == 2 || i == 1 || bVar.y + jMax > jElapsedRealtime;
    }

    @Override // defpackage.jz4
    public final boolean d(Uri uri, long j) {
        c cVar = this.w.get(uri);
        if (cVar != null) {
            HashMap map = cVar.b;
            xl7.r(map.containsKey(uri));
            b bVar = (b) map.get(uri);
            bVar.getClass();
            if (j <= bVar.B) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.jz4
    public final void e(Uri uri) {
        c cVar = this.w.get(uri);
        if (cVar != null) {
            HashMap map = cVar.b;
            xl7.r(map.containsKey(uri));
            b bVar = (b) map.get(uri);
            bVar.getClass();
            bVar.E = false;
        }
    }

    @Override // defpackage.jz4
    public final void f(Uri uri) throws IOException {
        c cVar = this.w.get(uri);
        if (cVar != null) {
            HashMap map = cVar.b;
            xl7.r(map.containsKey(uri));
            b bVar = (b) map.get(uri);
            bVar.getClass();
            yb6 yb6Var = bVar.v;
            IOException iOException = yb6Var.c;
            if (iOException != null) {
                throw iOException;
            }
            yb6.c<? extends yb6.d> cVar2 = yb6Var.b;
            if (cVar2 != null) {
                int i = cVar2.t;
                IOException iOException2 = cVar2.x;
                if (iOException2 != null && cVar2.y > i) {
                    throw iOException2;
                }
            }
            IOException iOException3 = bVar.D;
            if (iOException3 != null) {
                throw iOException3;
            }
        }
    }

    @Override // defpackage.jz4
    public final k95 g(int i) {
        if (i == 0) {
            return this.E;
        }
        if (i == 1) {
            return this.F;
        }
        if (i == 2) {
            return this.G;
        }
        if (i != 3) {
            return null;
        }
        return this.H;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yb6.a
    public final void h(yb6.d dVar, long j, long j2) {
        fz4 fz4Var;
        vt7 vt7Var = (vt7) dVar;
        gz4 gz4Var = (gz4) vt7Var.f;
        boolean z = gz4Var instanceof dz4;
        if (z) {
            String str = gz4Var.a;
            fz4 fz4Var2 = fz4.n;
            Uri uri = Uri.parse(str);
            id4.a aVar = new id4.a();
            aVar.a = "0";
            aVar.m = fv6.n("application/x-mpegURL");
            List listSingletonList = Collections.singletonList(new fz4.b(uri, new id4(aVar), null, null, null, null, null, null));
            List list = Collections.EMPTY_LIST;
            fz4Var = new fz4(BuildConfig.FLAVOR, list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            fz4Var = (fz4) gz4Var;
        }
        this.C = fz4Var;
        try {
            this.E = kz4.b(fz4Var.e);
            this.F = kz4.a(fz4Var.f);
            this.G = kz4.a(fz4Var.g);
            this.H = kz4.a(fz4Var.h);
            this.I = this.E.get(0).c();
            this.x.add(new a());
            s(this.E);
            s(this.F);
            s(this.G);
            s(this.H);
            of2 of2Var = vt7Var.b;
            c1a c1aVar = vt7Var.d;
            rb6 rb6Var = new rb6(of2Var, c1aVar.c, c1aVar.d, j, j2, c1aVar.b);
            c cVar = this.w.get(this.I);
            cVar.getClass();
            if (z) {
                Uri uri2 = vt7Var.d.c;
                HashMap map = cVar.b;
                xl7.r(map.containsKey(uri2));
                b bVar = (b) map.get(uri2);
                bVar.getClass();
                bVar.e((dz4) gz4Var, rb6Var);
            } else {
                c.b(cVar, this.I, false);
            }
            this.v.getClass();
            this.y.c(rb6Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } catch (ut7 e) {
            this.D = e;
        }
    }

    @Override // defpackage.jz4
    public final void i(cz4 cz4Var) {
        this.x.remove(cz4Var);
    }

    @Override // defpackage.jz4
    public final void j(cz4 cz4Var) {
        this.x.add(cz4Var);
    }

    @Override // defpackage.jz4
    public final long k() {
        return this.L;
    }

    @Override // defpackage.jz4
    public final boolean l() {
        return this.K;
    }

    @Override // defpackage.jz4
    public final fz4 m() {
        return this.C;
    }

    @Override // defpackage.jz4
    public final boolean n(Uri uri, long j) {
        c cVar = this.w.get(uri);
        if (cVar != null) {
            return c.c(cVar, uri, j);
        }
        return false;
    }

    @Override // yb6.a
    public final void o(yb6.d dVar, long j, long j2, int i) {
        rb6 rb6Var;
        vt7 vt7Var = (vt7) dVar;
        if (i == 0) {
            long j3 = vt7Var.a;
            rb6Var = new rb6(vt7Var.b, j);
        } else {
            long j4 = vt7Var.a;
            of2 of2Var = vt7Var.b;
            c1a c1aVar = vt7Var.d;
            rb6Var = new rb6(of2Var, c1aVar.c, c1aVar.d, j, j2, c1aVar.b);
        }
        this.y.e(rb6Var, vt7Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // defpackage.jz4
    public final void p(Uri uri) {
        c cVar = this.w.get(uri);
        if (cVar != null) {
            c.b(cVar, uri, true);
        }
    }

    @Override // defpackage.jz4
    public final kz4 q(Uri uri) {
        c cVar = this.w.get(uri);
        if (cVar != null) {
            return cVar.a;
        }
        return null;
    }

    @Override // defpackage.jz4
    public final dz4 r(boolean z, Uri uri) {
        HashMap<Uri, c> map = this.w;
        c cVar = map.get(uri);
        if (cVar == null) {
            return null;
        }
        dz4 dz4VarA = c.a(cVar, uri);
        if (dz4VarA != null && z) {
            v(uri);
            c cVar2 = map.get(uri);
            cVar2.getClass();
            HashMap map2 = cVar2.b;
            xl7.r(map2.containsKey(uri));
            b bVar = (b) map2.get(uri);
            bVar.getClass();
            if (!bVar.E) {
                xl7.r(map2.containsKey(uri));
                b bVar2 = (b) map2.get(uri);
                bVar2.getClass();
                bVar2.E = true;
                dz4 dz4VarA2 = c.a(cVar2, uri);
                if (dz4VarA2 != null && !dz4VarA2.o) {
                    c.b(cVar2, uri, true);
                }
            }
        }
        return dz4VarA;
    }

    public final void s(List<kz4> list) {
        for (int i = 0; i < list.size(); i++) {
            kz4 kz4Var = list.get(i);
            c cVar = new c(kz4Var);
            w2b it = q95.p(kz4Var.b.values()).iterator();
            while (it.hasNext()) {
                this.w.put((Uri) it.next(), cVar);
            }
        }
    }

    public final Uri t(Uri uri) {
        dz4.d dVar;
        dz4 dz4Var = this.J;
        if (dz4Var == null || !dz4Var.v.e || (dVar = (dz4.d) ((vl8) dz4Var.t).get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(dVar.b));
        int i = dVar.c;
        if (i != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return builderBuildUpon.build();
    }

    @Override // yb6.a
    public final yb6.b u(yb6.d dVar, long j, long j2, IOException iOException, int i) {
        vt7 vt7Var = (vt7) dVar;
        long j3 = vt7Var.a;
        of2 of2Var = vt7Var.b;
        c1a c1aVar = vt7Var.d;
        rb6 rb6Var = new rb6(of2Var, c1aVar.c, c1aVar.d, j, j2, c1aVar.b);
        int i2 = vt7Var.c;
        long jA = this.v.a(new qb6.c(iOException, i));
        boolean z = jA == -9223372036854775807L;
        this.y.d(rb6Var, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
        return z ? yb6.f : new yb6.b(0, jA);
    }

    public final void v(Uri uri) {
        if (uri.equals(this.I)) {
            return;
        }
        List<fz4.b> list = this.C.e;
        for (int i = 0; i < list.size(); i++) {
            if (uri.equals(list.get(i).a)) {
                dz4 dz4Var = this.J;
                if (dz4Var == null || !dz4Var.o) {
                    this.I = uri;
                    c cVar = this.w.get(uri);
                    cVar.getClass();
                    dz4 dz4VarA = c.a(cVar, uri);
                    if (dz4VarA != null && dz4VarA.o) {
                        this.J = dz4VarA;
                        this.B.v(dz4VarA);
                        return;
                    }
                    Uri uriT = t(uri);
                    HashMap map = cVar.b;
                    xl7.r(map.containsKey(uri));
                    b bVar = (b) map.get(uri);
                    bVar.getClass();
                    bVar.d(uriT);
                    return;
                }
                return;
            }
        }
    }
}
