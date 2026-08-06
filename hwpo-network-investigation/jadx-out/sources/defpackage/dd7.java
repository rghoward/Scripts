package defpackage;

import android.app.PendingIntent;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dd7 {
    public final int a;
    public final String b;
    public final String c;
    public final PendingIntent d;

    public dd7(int i, String str, String str2, PendingIntent pendingIntent) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd7)) {
            return false;
        }
        dd7 dd7Var = (dd7) obj;
        return this.a == dd7Var.a && this.b.equals(dd7Var.b) && this.c.equals(dd7Var.c) && this.d.equals(dd7Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ru3.c(ru3.c(os2.a(R.drawable.ic_hwpo_notification, ((((Integer.hashCode(this.a) * 31) - 2032106872) * 31) + 1583778045) * 31, 31), 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbB = u43.b("NotificationModel(id=", ", channelId=com.hwpo_training_app.HWPO_CLIENT_CHANNEL_ID, channelName=HWPO Client, smallIcon=", ", contentTitle=", this.a, R.drawable.ic_hwpo_notification);
        ux1.b(sbB, this.b, ", contentText=", this.c, ", intent=");
        sbB.append(this.d);
        sbB.append(")");
        return sbB.toString();
    }
}
