package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uzb implements tzb {
    @Override // defpackage.tzb
    public final StackTraceElement[] a(int i) {
        if (!(i == -1 || i > 0)) {
            z90.a("maxDepth must be > 0 or -1");
            return null;
        }
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String name = p8d.class.getName();
        int i2 = 3;
        boolean z = false;
        while (true) {
            if (i2 >= stackTrace.length) {
                i2 = -1;
                break;
            }
            if (stackTrace[i2].getClassName().equals(name)) {
                z = true;
            } else if (z) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            return new StackTraceElement[0];
        }
        int length = stackTrace.length - i2;
        if (i <= 0 || i >= length) {
            i = length;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i];
        System.arraycopy(stackTrace, i2, stackTraceElementArr, 0, i);
        return stackTraceElementArr;
    }
}
