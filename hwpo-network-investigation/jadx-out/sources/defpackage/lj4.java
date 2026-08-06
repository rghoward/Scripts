package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lj4 {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = n6b.a;
            int i = Integer.parseInt(strGroup, 16);
            int i2 = Integer.parseInt(matcher.group(2), 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.a = i;
            this.b = i2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0086  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void b(su6 su6Var) {
        su6.a aVar;
        su6Var.getClass();
        k95.b bVar = k95.u;
        k95.a aVar2 = new k95.a();
        su6.a[] aVarArr = su6Var.a;
        int length = aVarArr.length;
        int i = 0;
        while (true) {
            su6.a aVar3 = null;
            if (i >= length) {
                break;
            }
            su6.a aVar4 = aVarArr[i];
            if (fk1.class.isAssignableFrom(aVar4.getClass())) {
                su6.a aVar5 = (su6.a) fk1.class.cast(aVar4);
                if (((fk1) aVar5).c.equals("iTunSMPB")) {
                    aVar3 = aVar5;
                }
            }
            if (aVar3 != null) {
                aVar2.c(aVar3);
            }
            i++;
        }
        k95.b bVarListIterator = aVar2.g().listIterator(0);
        while (bVarListIterator.hasNext()) {
            if (a(((fk1) bVarListIterator.next()).d)) {
                return;
            }
        }
        kj4 kj4Var = new kj4();
        k95.b bVar2 = k95.u;
        k95.a aVar6 = new k95.a();
        for (su6.a aVar7 : su6Var.a) {
            if (ej5.class.isAssignableFrom(aVar7.getClass())) {
                aVar = (su6.a) ej5.class.cast(aVar7);
                if (!kj4Var.apply(aVar)) {
                    aVar = null;
                }
            } else {
                aVar = null;
            }
            if (aVar != null) {
                aVar6.c(aVar);
            }
        }
        k95.b bVarListIterator2 = aVar6.g().listIterator(0);
        while (bVarListIterator2.hasNext() && !a(((ej5) bVarListIterator2.next()).d)) {
        }
    }
}
