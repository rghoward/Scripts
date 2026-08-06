package defpackage;

import android.app.Notification;
import android.app.Person;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import io.intercom.android.sdk.models.AttributeType;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xc7 extends yc7 {
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ox7 g;
    public Boolean h;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
            return messagingStyle.addMessage(message);
        }

        public static Notification.MessagingStyle b(CharSequence charSequence) {
            return new Notification.MessagingStyle(charSequence);
        }

        public static Notification.MessagingStyle c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
            return messagingStyle.setConversationTitle(charSequence);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b {
        public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
            return messagingStyle.addHistoricMessage(message);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c {
        public static Notification.MessagingStyle a(Person person) {
            return new Notification.MessagingStyle(person);
        }

        public static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z) {
            return messagingStyle.setGroupConversation(z);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d {
        public final CharSequence a;
        public final long b;
        public final ox7 c;
        public final Bundle d = new Bundle();
        public String e;
        public Uri f;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static class a {
            public static Notification.MessagingStyle.Message a(CharSequence charSequence, long j, CharSequence charSequence2) {
                return new Notification.MessagingStyle.Message(charSequence, j, charSequence2);
            }

            public static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
                return message.setData(str, uri);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static class b {
            public static Parcelable a(Person person) {
                return person;
            }

            public static Notification.MessagingStyle.Message b(CharSequence charSequence, long j, Person person) {
                return new Notification.MessagingStyle.Message(charSequence, j, person);
            }
        }

        public d(String str, long j, ox7 ox7Var) {
            this.a = str;
            this.b = j;
            this.c = ox7Var;
        }

        public static Bundle[] a(ArrayList arrayList) {
            Bundle[] bundleArr = new Bundle[arrayList.size()];
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                d dVar = (d) arrayList.get(i);
                ox7 ox7Var = dVar.c;
                Bundle bundle = new Bundle();
                CharSequence charSequence = dVar.a;
                if (charSequence != null) {
                    bundle.putCharSequence(AttributeType.TEXT, charSequence);
                }
                bundle.putLong("time", dVar.b);
                if (ox7Var != null) {
                    bundle.putCharSequence("sender", ox7Var.a);
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", b.a(ox7.a.a(ox7Var)));
                    } else {
                        bundle.putBundle("person", ox7Var.a());
                    }
                }
                String str = dVar.e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = dVar.f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = dVar.d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                bundleArr[i] = bundle;
            }
            return bundleArr;
        }

        public final Notification.MessagingStyle.Message b() {
            Notification.MessagingStyle.Message messageA;
            int i = Build.VERSION.SDK_INT;
            long j = this.b;
            ox7 ox7Var = this.c;
            CharSequence charSequence = this.a;
            if (i >= 28) {
                messageA = b.b(charSequence, j, ox7Var != null ? ox7.a.a(ox7Var) : null);
            } else {
                messageA = a.a(charSequence, j, ox7Var != null ? ox7Var.a : null);
            }
            String str = this.e;
            if (str != null) {
                a.b(messageA, str, this.f);
            }
            return messageA;
        }
    }

    public xc7(ox7 ox7Var) {
        if (TextUtils.isEmpty(ox7Var.a)) {
            z90.a("User's name must not be empty.");
            throw null;
        }
        this.g = ox7Var;
    }

    @Override // defpackage.yc7
    public final void a(Bundle bundle) {
        super.a(bundle);
        ox7 ox7Var = this.g;
        bundle.putCharSequence("android.selfDisplayName", ox7Var.a);
        bundle.putBundle("android.messagingStyleUser", ox7Var.a());
        bundle.putCharSequence("android.hiddenConversationTitle", null);
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", d.a(arrayList));
        }
        ArrayList arrayList2 = this.f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", d.a(arrayList2));
        }
        Boolean bool = this.h;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    @Override // defpackage.yc7
    public final void b(zc7 zc7Var) {
        Boolean bool;
        Notification.MessagingStyle messagingStyleB;
        uc7 uc7Var = this.a;
        int i = 0;
        this.h = Boolean.valueOf(((uc7Var == null || uc7Var.a.getApplicationInfo().targetSdkVersion >= 28 || this.h != null) && (bool = this.h) != null) ? bool.booleanValue() : false);
        int i2 = Build.VERSION.SDK_INT;
        ox7 ox7Var = this.g;
        if (i2 >= 28) {
            ox7Var.getClass();
            messagingStyleB = c.a(ox7.a.a(ox7Var));
        } else {
            messagingStyleB = a.b(ox7Var.a);
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            a.a(messagingStyleB, ((d) obj).b());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            ArrayList arrayList2 = this.f;
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                b.a(messagingStyleB, ((d) obj2).b());
            }
        }
        if (this.h.booleanValue() || Build.VERSION.SDK_INT >= 28) {
            a.c(messagingStyleB, null);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            c.b(messagingStyleB, this.h.booleanValue());
        }
        messagingStyleB.setBuilder(zc7Var.b);
    }

    @Override // defpackage.yc7
    public final String c() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }
}
