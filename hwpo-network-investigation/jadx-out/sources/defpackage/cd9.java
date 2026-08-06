package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cd9 extends ed9 {
    public static List e(yc9 yc9Var) {
        Iterator it = yc9Var.iterator();
        if (!it.hasNext()) {
            return hf3.t;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return ws0.h(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
