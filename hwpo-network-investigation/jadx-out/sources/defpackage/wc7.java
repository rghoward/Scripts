package defpackage;

import android.app.Notification;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wc7 extends yc7 {
    public final ArrayList<CharSequence> e = new ArrayList<>();

    @Override // defpackage.yc7
    public final void b(zc7 zc7Var) {
        Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(zc7Var.b).setBigContentTitle(this.b);
        if (this.d) {
            bigContentTitle.setSummaryText(this.c);
        }
        ArrayList<CharSequence> arrayList = this.e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            CharSequence charSequence = arrayList.get(i);
            i++;
            bigContentTitle.addLine(charSequence);
        }
    }

    @Override // defpackage.yc7
    public final String c() {
        return "androidx.core.app.NotificationCompat$InboxStyle";
    }
}
