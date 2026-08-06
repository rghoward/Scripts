package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uo2 implements gb6.a, hz8.a {
    public static int a(int i, boolean z, int i2) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    @Override // hz8.a
    public Object apply(Object obj) {
        return (List) hz8.E(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new vo2());
    }

    @Override // gb6.a
    public void invoke(Object obj) {
        ((aj) obj).getClass();
    }
}
