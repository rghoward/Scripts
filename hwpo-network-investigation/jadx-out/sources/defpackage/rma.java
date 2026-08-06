package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class rma {
    public static final a a = new a();
    public static final ArrayList<b> b = new ArrayList<>();
    public static volatile b[] c = new b[0];

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends b {
        @Override // rma.b
        public final void a(String str, Object... objArr) {
            for (b bVar : rma.c) {
                bVar.a(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // rma.b
        public final void b(Throwable th) {
            for (b bVar : rma.c) {
                bVar.b(th);
            }
        }

        @Override // rma.b
        public final void c(Object... objArr) {
            for (b bVar : rma.c) {
                bVar.c(Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // rma.b
        public final void d(int i, String str, String str2, Throwable th) {
            str2.getClass();
            throw new AssertionError();
        }

        @Override // rma.b
        public final void f(Object... objArr) {
            for (b bVar : rma.c) {
                bVar.f(Arrays.copyOf(objArr, objArr.length));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class b {
        public final ThreadLocal<String> a = new ThreadLocal<>();

        public void a(String str, Object... objArr) {
            e(3, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void b(Throwable th) {
            e(6, th, null, new Object[0]);
        }

        public void c(Object... objArr) {
            e(6, null, "transformBitmap: %s", Arrays.copyOf(objArr, objArr.length));
        }

        public abstract void d(int i, String str, String str2, Throwable th);

        public final void e(int i, Throwable th, String str, Object... objArr) {
            ThreadLocal<String> threadLocal = this.a;
            String str2 = threadLocal.get();
            if (str2 != null) {
                threadLocal.remove();
            }
            if (str != null && str.length() != 0) {
                if (objArr.length != 0) {
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    str = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                }
                if (th != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) str);
                    sb.append('\n');
                    StringWriter stringWriter = new StringWriter(256);
                    PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
                    th.printStackTrace(printWriter);
                    printWriter.flush();
                    String string = stringWriter.toString();
                    string.getClass();
                    sb.append(string);
                    str = sb.toString();
                }
            } else {
                if (th == null) {
                    return;
                }
                StringWriter stringWriter2 = new StringWriter(256);
                PrintWriter printWriter2 = new PrintWriter((Writer) stringWriter2, false);
                th.printStackTrace(printWriter2);
                printWriter2.flush();
                str = stringWriter2.toString();
                str.getClass();
            }
            d(i, str2, str, th);
        }

        public void f(Object... objArr) {
            e(5, null, "Multiple observers registered but only one will be notified of changes.", Arrays.copyOf(objArr, objArr.length));
        }
    }
}
