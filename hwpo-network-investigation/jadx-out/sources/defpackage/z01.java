package defpackage;

import android.graphics.Bitmap;
import io.ably.lib.http.HttpConstants;
import io.ably.lib.rest.Auth;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class z01 {
    public final jp8 a;
    public final y01 b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class a {
        public static nu4 a(nu4 nu4Var, nu4 nu4Var2) {
            nu4.a aVar = new nu4.a();
            int size = nu4Var.size();
            for (int i = 0; i < size; i++) {
                String strE = nu4Var.e(i);
                String strJ = nu4Var.j(i);
                if ((!"Warning".equalsIgnoreCase(strE) || !w2a.n(strJ, "1", false)) && ("Content-Length".equalsIgnoreCase(strE) || "Content-Encoding".equalsIgnoreCase(strE) || "Content-Type".equalsIgnoreCase(strE) || !b(strE) || nu4Var2.d(strE) == null)) {
                    aVar.c(strE, strJ);
                }
            }
            int size2 = nu4Var2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String strE2 = nu4Var2.e(i2);
                if (!"Content-Length".equalsIgnoreCase(strE2) && !"Content-Encoding".equalsIgnoreCase(strE2) && !"Content-Type".equalsIgnoreCase(strE2) && b(strE2)) {
                    aVar.c(strE2, nu4Var2.j(i2));
                }
            }
            return aVar.d();
        }

        public static boolean b(String str) {
            return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || HttpConstants.Headers.PROXY_AUTHENTICATE.equalsIgnoreCase(str) || HttpConstants.Headers.PROXY_AUTHORIZATION.equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final jp8 a;
        public final y01 b;
        public final Date c;
        public final String d;
        public final Date e;
        public final String f;
        public final Date g;
        public final long h;
        public final long i;
        public final String j;
        public final int k;

        public b(jp8 jp8Var, y01 y01Var) {
            int i;
            this.a = jp8Var;
            this.b = y01Var;
            this.k = -1;
            if (y01Var != null) {
                this.h = y01Var.c;
                this.i = y01Var.d;
                nu4 nu4Var = y01Var.f;
                int size = nu4Var.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String strE = nu4Var.e(i2);
                    if (strE.equalsIgnoreCase("Date")) {
                        String strD = nu4Var.d("Date");
                        this.c = strD != null ? xg2.a(strD) : null;
                        this.d = nu4Var.j(i2);
                    } else if (strE.equalsIgnoreCase("Expires")) {
                        String strD2 = nu4Var.d("Expires");
                        this.g = strD2 != null ? xg2.a(strD2) : null;
                    } else if (strE.equalsIgnoreCase("Last-Modified")) {
                        String strD3 = nu4Var.d("Last-Modified");
                        this.e = strD3 != null ? xg2.a(strD3) : null;
                        this.f = nu4Var.j(i2);
                    } else if (strE.equalsIgnoreCase("ETag")) {
                        this.j = nu4Var.j(i2);
                    } else if (strE.equalsIgnoreCase("Age")) {
                        String strJ = nu4Var.j(i2);
                        Bitmap.Config[] configArr = v.a;
                        Long lG = v2a.g(strJ);
                        if (lG != null) {
                            long jLongValue = lG.longValue();
                            i = jLongValue > 2147483647L ? Integer.MAX_VALUE : jLongValue < 0 ? 0 : (int) jLongValue;
                        } else {
                            i = -1;
                        }
                        this.k = i;
                    }
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00d0  */
        public final z01 a() {
            String string;
            long time;
            int i;
            jp8 jp8Var = this.a;
            f55 f55Var = jp8Var.a;
            y01 y01Var = this.b;
            if (y01Var == null) {
                return new z01(jp8Var, null);
            }
            ss5 ss5Var = y01Var.a;
            if (f55Var.f() && !y01Var.e) {
                return new z01(jp8Var, null);
            }
            n01 n01Var = (n01) ss5Var.getValue();
            if (jp8Var.a().b || ((n01) ss5Var.getValue()).b || xj5.a(y01Var.f.d("Vary"), Auth.WILDCARD_CLIENTID)) {
                return new z01(jp8Var, null);
            }
            n01 n01VarA = jp8Var.a();
            if (!n01VarA.a) {
                nu4 nu4Var = jp8Var.c;
                String str = "If-Modified-Since";
                if (nu4Var.d("If-Modified-Since") == null && nu4Var.d("If-None-Match") == null) {
                    long time2 = this.i;
                    Date date = this.c;
                    long jMax = date != null ? Math.max(0L, time2 - date.getTime()) : 0L;
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    int i2 = this.k;
                    if (i2 != -1) {
                        jMax = Math.max(jMax, timeUnit.toMillis(i2));
                    }
                    long time3 = this.h;
                    long jLongValue = jMax + (time2 - time3) + (((Number) sma.a.invoke()).longValue() - time2);
                    int i3 = ((n01) ss5Var.getValue()).c;
                    Date date2 = this.e;
                    if (i3 != -1) {
                        time = timeUnit.toMillis(i3);
                    } else {
                        Date date3 = this.g;
                        if (date3 != null) {
                            if (date != null) {
                                time2 = date.getTime();
                            }
                            time = date3.getTime() - time2;
                            if (time <= 0) {
                                time = 0;
                            }
                        } else if (date2 == null) {
                            time = 0;
                        } else {
                            List<String> list = f55Var.g;
                            if (list == null) {
                                string = null;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                f55.b.a(list, sb);
                                string = sb.toString();
                            }
                            if (string != null) {
                                time = 0;
                            } else {
                                if (date != null) {
                                    time3 = date.getTime();
                                }
                                long time4 = time3 - date2.getTime();
                                if (time4 > 0) {
                                    time = time4 / 10;
                                } else {
                                    time = 0;
                                }
                            }
                        }
                    }
                    int i4 = n01VarA.c;
                    if (i4 != -1) {
                        time = Math.min(time, timeUnit.toMillis(i4));
                    }
                    int i5 = n01VarA.i;
                    long millis = i5 != -1 ? timeUnit.toMillis(i5) : 0L;
                    long millis2 = (n01Var.g || (i = n01VarA.h) == -1) ? 0L : timeUnit.toMillis(i);
                    if (!n01Var.a && jLongValue + millis < time + millis2) {
                        return new z01(null, y01Var);
                    }
                    String str2 = this.j;
                    if (str2 != null) {
                        str = "If-None-Match";
                    } else if (date2 != null) {
                        str2 = this.f;
                        str2.getClass();
                    } else {
                        if (date == null) {
                            return new z01(jp8Var, null);
                        }
                        str2 = this.d;
                        str2.getClass();
                    }
                    jp8.a aVarB = jp8Var.b();
                    aVarB.c.a(str, str2);
                    return new z01(new jp8(aVarB), y01Var);
                }
            }
            return new z01(jp8Var, null);
        }
    }

    public z01(jp8 jp8Var, y01 y01Var) {
        this.a = jp8Var;
        this.b = y01Var;
    }
}
