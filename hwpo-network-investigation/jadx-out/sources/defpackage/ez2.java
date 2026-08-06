package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ez2 extends RuntimeException {
    public final xs1 t;

    public ez2(xs1 xs1Var) {
        this.t = xs1Var;
        if (xs1Var.b) {
            return;
        }
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        List<at1> list = xs1Var.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            at1 at1Var = list.get(i);
            if (!u30.u(iArr, at1Var.a)) {
                if (at1Var.a == 100) {
                    int i3 = i + 2;
                    if (i3 < size && list.get(i3).a == 1000) {
                        break;
                    } else {
                        rh1.s(arrayList);
                    }
                } else {
                    arrayList.add(at1Var);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            stackTraceElementArr[i4] = new StackTraceElement("$$compose", "m$" + ((at1) arrayList.get(i4)).a, "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        xs1 xs1Var = this.t;
        if (!xs1Var.b) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        e96 e96VarF = ws0.f();
        List<at1> list = xs1Var.a;
        list.getClass();
        xv8 xv8Var = new xv8(list);
        int iD = xv8Var.d();
        String str = null;
        String str2 = null;
        for (int i = 0; i < iD; i++) {
            at1 at1Var = (at1) xv8Var.get(i);
            pw9 pw9Var = at1Var.b;
            Integer num = at1Var.c;
            if (pw9Var != null) {
                boolean z = pw9Var.a;
                String str3 = pw9Var.b;
                if (str3 == null) {
                    String str4 = z ? "<lambda>" : null;
                    if (str4 != null) {
                        str = str4;
                    } else if (str == null) {
                        str = "<unknown function>";
                    }
                } else {
                    str = str3;
                }
                String str5 = pw9Var.c;
                if (str5 != null) {
                    str2 = str5;
                } else if (str2 == null) {
                    str2 = "<unknown file>";
                }
                List<fd6> list2 = pw9Var.f;
                String str6 = str + '(' + str2 + ':' + ((num == null || num.intValue() >= list2.size()) ? "<unknown line>" : String.valueOf(list2.get(num.intValue()).a)) + ')';
                if (!z) {
                }
                if (!xj5.a(str3, "rememberCompositionContext") || !xj5.a(pw9Var.e, "9igjgp")) {
                    e96VarF.add(str6);
                }
            }
        }
        e96 e96VarE = ws0.e(e96VarF);
        e96VarE.getClass();
        xv8 xv8Var2 = new xv8(e96VarE);
        int iD2 = xv8Var2.d();
        for (int i2 = 0; i2 < iD2; i2++) {
            String str7 = (String) xv8Var2.get(i2);
            sb.append("\tat ");
            sb.append(str7);
            sb.append('\n');
        }
        return sb.toString();
    }
}
