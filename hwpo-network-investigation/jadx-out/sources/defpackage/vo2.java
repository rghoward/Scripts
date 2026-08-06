package defpackage;

import android.database.Cursor;
import android.util.Base64;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vo2 implements gb6.a, hz8.a {
    @Override // hz8.a
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            byte[] bArrDecode = null;
            if (string == null) {
                ac4.c("Null backendName");
                return null;
            }
            o98 o98VarB = r98.b(cursor.getInt(2));
            String string2 = cursor.getString(3);
            if (string2 != null) {
                bArrDecode = Base64.decode(string2, 0);
            }
            arrayList.add(new ef0(string, bArrDecode, o98VarB));
        }
        return arrayList;
    }

    @Override // gb6.a
    public void invoke(Object obj) {
        ((aj) obj).getClass();
    }
}
