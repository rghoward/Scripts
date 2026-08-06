package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dv6 implements zy9 {
    public final zy9[] a;
    public final ev6 b = new ev6();

    public dv6(zy9... zy9VarArr) {
        this.a = zy9VarArr;
    }

    @Override // defpackage.zy9
    public final StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrA = stackTraceElementArr;
        for (int i = 0; i < 1; i++) {
            zy9 zy9Var = this.a[i];
            if (stackTraceElementArrA.length <= 1024) {
                break;
            }
            stackTraceElementArrA = zy9Var.a(stackTraceElementArr);
        }
        return stackTraceElementArrA.length > 1024 ? this.b.a(stackTraceElementArrA) : stackTraceElementArrA;
    }
}
