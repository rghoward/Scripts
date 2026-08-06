package defpackage;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.File;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o07 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ o07(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() throws Throwable {
        Throwable th;
        ParcelFileDescriptor parcelFileDescriptorOpen;
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                q07 q07Var = (q07) obj;
                xl9.a.getClass();
                File file = new File(q07Var.b.getAbsolutePath() + q07Var.e);
                q07.f(file);
                xl9.b bVar = null;
                try {
                    parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 939524096);
                    try {
                        parcelFileDescriptorOpen.getClass();
                        NativeSharedCounter nativeSharedCounter = xl9.a.b;
                        if (nativeSharedCounter != null) {
                            int fd = parcelFileDescriptorOpen.getFd();
                            if (nativeSharedCounter.nativeTruncateFile(fd) == 0) {
                                long jNativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd);
                                if (jNativeCreateSharedCounter >= 0) {
                                    bVar = new xl9.b(nativeSharedCounter, jNativeCreateSharedCounter);
                                } else {
                                    o03.a("Failed to mmap counter file");
                                }
                            } else {
                                o03.a("Failed to truncate counter file");
                            }
                        } else {
                            aa0.c("DataStore failed to load the native library to create SharedCounter.");
                        }
                        parcelFileDescriptorOpen.close();
                        return bVar;
                    } catch (Throwable th2) {
                        th = th2;
                        if (parcelFileDescriptorOpen != null) {
                            parcelFileDescriptorOpen.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    parcelFileDescriptorOpen = null;
                }
                break;
            default:
                return od9.b("io.intercom.android.sdk.m5.push.IntercomPushData.ConversationPushData.MessageData", p58.b.a, new SerialDescriptor[0], new vy5(3, (c89) obj));
        }
    }
}
