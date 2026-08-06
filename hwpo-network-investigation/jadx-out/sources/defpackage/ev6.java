package defpackage;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ev6 implements zy9 {
    public static final /* synthetic */ int a = 0;

    public static final mi8 b(yq9 yq9Var) {
        yq9Var.getClass();
        return new mi8(yq9Var);
    }

    public static final vd5 c(InputStream inputStream) {
        inputStream.getClass();
        return new vd5(inputStream, new voa());
    }

    @Override // defpackage.zy9
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }
}
