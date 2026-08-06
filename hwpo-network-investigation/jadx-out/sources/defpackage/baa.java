package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class baa implements Iterable<Intent> {
    public final ArrayList<Intent> t = new ArrayList<>();
    public final Context u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
        Intent getSupportParentActivityIntent();
    }

    public baa(Context context) {
        this.u = context;
    }

    public final void d(ComponentName componentName) {
        Context context = this.u;
        ArrayList<Intent> arrayList = this.t;
        int size = arrayList.size();
        try {
            for (Intent intentB = n77.b(context, componentName); intentB != null; intentB = n77.b(context, intentB.getComponent())) {
                arrayList.add(size, intentB);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public final void e() {
        ArrayList<Intent> arrayList = this.t;
        if (arrayList.isEmpty()) {
            aa0.c("No intents added to TaskStackBuilder; cannot startActivities");
            return;
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.u.startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.t.iterator();
    }
}
