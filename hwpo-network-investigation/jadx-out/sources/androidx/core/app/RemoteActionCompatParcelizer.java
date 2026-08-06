package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.ydb;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(ydb ydbVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object objL = remoteActionCompat.a;
        if (ydbVar.h(1)) {
            objL = ydbVar.l();
        }
        remoteActionCompat.a = (IconCompat) objL;
        CharSequence charSequenceG = remoteActionCompat.b;
        if (ydbVar.h(2)) {
            charSequenceG = ydbVar.g();
        }
        remoteActionCompat.b = charSequenceG;
        CharSequence charSequenceG2 = remoteActionCompat.c;
        if (ydbVar.h(3)) {
            charSequenceG2 = ydbVar.g();
        }
        remoteActionCompat.c = charSequenceG2;
        Parcelable parcelableJ = remoteActionCompat.d;
        if (ydbVar.h(4)) {
            parcelableJ = ydbVar.j();
        }
        remoteActionCompat.d = (PendingIntent) parcelableJ;
        boolean zE = remoteActionCompat.e;
        if (ydbVar.h(5)) {
            zE = ydbVar.e();
        }
        remoteActionCompat.e = zE;
        boolean zE2 = remoteActionCompat.f;
        if (ydbVar.h(6)) {
            zE2 = ydbVar.e();
        }
        remoteActionCompat.f = zE2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, ydb ydbVar) {
        ydbVar.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        ydbVar.m(1);
        ydbVar.t(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        ydbVar.m(2);
        ydbVar.p(charSequence);
        CharSequence charSequence2 = remoteActionCompat.c;
        ydbVar.m(3);
        ydbVar.p(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.d;
        ydbVar.m(4);
        ydbVar.r(pendingIntent);
        boolean z = remoteActionCompat.e;
        ydbVar.m(5);
        ydbVar.n(z);
        boolean z2 = remoteActionCompat.f;
        ydbVar.m(6);
        ydbVar.n(z2);
    }
}
