package okhttp3.internal.publicsuffix;

import com.intercom.twig.BuildConfig;
import defpackage.ca0;
import defpackage.g01;
import defpackage.hf3;
import defpackage.pk;
import defpackage.r2a;
import defpackage.s83;
import defpackage.sh1;
import defpackage.t40;
import defpackage.t83;
import defpackage.th1;
import defpackage.ua1;
import defpackage.vtb;
import defpackage.ws0;
import defpackage.xj5;
import defpackage.yc9;
import defpackage.z2a;
import io.ably.lib.rest.Auth;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class PublicSuffixDatabase {
    public static final g01 b;
    public static final List<String> c;
    public static final PublicSuffixDatabase d;
    public final t40 a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final String a(g01 g01Var, g01[] g01VarArr, int i) {
            int i2;
            boolean z;
            int i3;
            int i4;
            g01 g01Var2 = PublicSuffixDatabase.b;
            int iG = g01Var.g();
            int i5 = 0;
            while (i5 < iG) {
                int i6 = (i5 + iG) / 2;
                while (i6 > -1 && g01Var.l(i6) != 10) {
                    i6--;
                }
                int i7 = i6 + 1;
                int i8 = 1;
                while (true) {
                    i2 = i7 + i8;
                    if (g01Var.l(i2) == 10) {
                        break;
                    }
                    i8++;
                }
                int i9 = i2 - i7;
                int i10 = i;
                boolean z2 = false;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (z2) {
                        i3 = 46;
                        z = false;
                    } else {
                        byte bL = g01VarArr[i10].l(i11);
                        byte[] bArr = vtb.a;
                        int i13 = bL & MessagePack.Code.EXT_TIMESTAMP;
                        z = z2;
                        i3 = i13;
                    }
                    byte bL2 = g01Var.l(i7 + i12);
                    byte[] bArr2 = vtb.a;
                    i4 = i3 - (bL2 & MessagePack.Code.EXT_TIMESTAMP);
                    if (i4 != 0) {
                        break;
                    }
                    i12++;
                    i11++;
                    if (i12 == i9) {
                        break;
                    }
                    if (g01VarArr[i10].g() != i11) {
                        z2 = z;
                    } else {
                        if (i10 == g01VarArr.length - 1) {
                            break;
                        }
                        i10++;
                        i11 = -1;
                        z2 = true;
                    }
                }
                if (i4 >= 0) {
                    if (i4 <= 0) {
                        int i14 = i9 - i12;
                        int iG2 = g01VarArr[i10].g() - i11;
                        int length = g01VarArr.length;
                        for (int i15 = i10 + 1; i15 < length; i15++) {
                            iG2 += g01VarArr[i15].g();
                        }
                        if (iG2 >= i14) {
                            if (iG2 <= i14) {
                                return g01Var.s(i7, i9 + i7).r(ua1.b);
                            }
                        }
                    }
                    i5 = i2 + 1;
                }
                iG = i6;
            }
            return null;
        }
    }

    static {
        g01 g01Var = g01.w;
        b = new g01(Arrays.copyOf(new byte[]{42}, 1));
        c = ws0.h(Auth.WILDCARD_CLIENTID);
        d = new PublicSuffixDatabase(new t40());
    }

    public PublicSuffixDatabase(t40 t40Var) {
        this.a = t40Var;
    }

    public static List b(String str) {
        List listJ = z2a.J(str, new char[]{'.'});
        if (!xj5.a(th1.G(listJ), BuildConfig.FLAVOR)) {
            return listJ;
        }
        int size = listJ.size() - 1;
        return th1.O(size >= 0 ? size : 0, listJ);
    }

    public final String a(String str) {
        String strA;
        String strA2;
        String strA3;
        List<String> listJ;
        int size;
        int size2;
        String unicode = IDN.toUnicode(str);
        unicode.getClass();
        List listB = b(unicode);
        t40 t40Var = this.a;
        AtomicBoolean atomicBoolean = t40Var.a;
        int i = 0;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                t40Var.b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        t40Var.b();
                        break;
                    } catch (Throwable th) {
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                } catch (InterruptedIOException unused2) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    t40Var.e = e;
                    if (z) {
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        if (t40Var.c == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Unable to load " + ((Object) t40Var.f) + " resource.");
            illegalStateException.initCause(t40Var.e);
            throw illegalStateException;
        }
        int size3 = listB.size();
        g01[] g01VarArr = new g01[size3];
        for (int i2 = 0; i2 < size3; i2++) {
            g01 g01Var = g01.w;
            g01VarArr[i2] = g01.a.c((String) listB.get(i2));
        }
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                strA = null;
                break;
            }
            strA = a.a(t40Var.a(), g01VarArr, i3);
            if (strA != null) {
                break;
            }
            i3++;
        }
        if (size3 <= 1) {
            strA2 = null;
            break;
        }
        g01[] g01VarArr2 = (g01[]) g01VarArr.clone();
        int length = g01VarArr2.length - 1;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                strA2 = null;
                break;
            }
            g01VarArr2[i4] = b;
            strA2 = a.a(t40Var.a(), g01VarArr2, i4);
            if (strA2 != null) {
                break;
            }
            i4++;
        }
        if (strA2 == null) {
            strA3 = null;
            break;
        }
        int i5 = size3 - 1;
        int i6 = 0;
        while (true) {
            if (i6 >= i5) {
                strA3 = null;
                break;
            }
            g01 g01Var2 = t40Var.d;
            if (g01Var2 == null) {
                xj5.e("exceptionBytes");
                throw null;
            }
            strA3 = a.a(g01Var2, g01VarArr, i6);
            if (strA3 != null) {
                break;
            }
            i6++;
        }
        if (strA3 != null) {
            listJ = z2a.J("!".concat(strA3), new char[]{'.'});
        } else if (strA == null && strA2 == null) {
            listJ = c;
        } else {
            hf3 hf3Var = hf3.t;
            List<String> listJ2 = strA != null ? z2a.J(strA, new char[]{'.'}) : hf3Var;
            listJ = strA2 != null ? z2a.J(strA2, new char[]{'.'}) : hf3Var;
            if (listJ2.size() > listJ.size()) {
                listJ = listJ2;
            }
        }
        if (listB.size() == listJ.size() && listJ.get(0).charAt(0) != '!') {
            return null;
        }
        if (listJ.get(0).charAt(0) == '!') {
            size = listB.size();
            size2 = listJ.size();
        } else {
            size = listB.size();
            size2 = listJ.size() + 1;
        }
        int i7 = size - size2;
        yc9 sh1Var = new sh1(b(str));
        if (i7 < 0) {
            ca0.a(pk.d(i7, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i7 != 0) {
            sh1Var = sh1Var instanceof t83 ? ((t83) sh1Var).a(i7) : new s83(sh1Var, i7);
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) BuildConfig.FLAVOR);
        for (Object obj : sh1Var) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) ".");
            }
            r2a.a(sb, obj, null);
        }
        sb.append((CharSequence) BuildConfig.FLAVOR);
        return sb.toString();
    }
}
