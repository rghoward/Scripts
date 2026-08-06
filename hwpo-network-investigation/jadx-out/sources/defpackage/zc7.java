package defpackage;

import android.app.Notification;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import androidx.core.graphics.drawable.IconCompat;
import com.hwpo_training_app.R;
import com.intercom.twig.BuildConfig;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zc7 {
    public final Context a;
    public final Notification.Builder b;
    public final uc7 c;
    public final Bundle d = new Bundle();
    public final int e;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        public static void b(Notification.Builder builder) {
            builder.setBadgeIconType(0);
        }

        public static void c(Notification.Builder builder, int i) {
            builder.setGroupAlertBehavior(i);
        }

        public static void d(Notification.Builder builder) {
            builder.setSettingsText(null);
        }

        public static void e(Notification.Builder builder, String str) {
            builder.setShortcutId(str);
        }

        public static void f(Notification.Builder builder) {
            builder.setTimeoutAfter(0L);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b {
        public static void a(Notification.Builder builder, Person person) {
            builder.addPerson(person);
        }

        public static void b(Notification.Action.Builder builder) {
            builder.setSemanticAction(0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c {
        public static void a(Notification.Builder builder, boolean z) {
            builder.setAllowSystemGeneratedContextualActions(z);
        }

        public static void b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            builder.setBubbleMetadata(bubbleMetadata);
        }

        public static void c(Notification.Action.Builder builder, boolean z) {
            builder.setContextual(z);
        }

        public static void d(Notification.Builder builder, Object obj) {
            builder.setLocusId((LocusId) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class d {
        public static void a(Notification.Action.Builder builder) {
            builder.setAuthenticationRequired(false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e {
        public static void a(Notification.Builder builder) {
            builder.setShortCriticalText(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:135:0x043f  */
    public zc7(uc7 uc7Var) {
        int i;
        int i2;
        Notification.BubbleMetadata bubbleMetadataA;
        Bundle[] bundleArr;
        int i3;
        ArrayList<String> arrayList;
        this.c = uc7Var;
        Context context = uc7Var.a;
        ArrayList<String> arrayList2 = uc7Var.z;
        ArrayList<ox7> arrayList3 = uc7Var.c;
        ArrayList<qc7> arrayList4 = uc7Var.d;
        this.a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.b = a.a(context, uc7Var.s);
        } else {
            this.b = new Notification.Builder(context);
        }
        Notification notification = uc7Var.x;
        int i4 = 0;
        this.b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(uc7Var.e).setContentText(uc7Var.f).setContentInfo(null).setContentIntent(uc7Var.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(uc7Var.i).setProgress(0, 0, false);
        Notification.Builder builder = this.b;
        IconCompat iconCompat = uc7Var.h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.h(context));
        this.b.setSubText(null).setUsesChronometer(false).setPriority(uc7Var.j);
        yc7 yc7Var = uc7Var.l;
        Resources resources = null;
        if (yc7Var instanceof vc7) {
            vc7 vc7Var = (vc7) yc7Var;
            int color = vc7Var.a.a.getColor(R.color.call_notification_decline_color);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) vc7Var.a.a.getResources().getString(R.string.call_notification_hang_up_action));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(color), 0, spannableStringBuilder.length(), 18);
            Context context2 = vc7Var.a.a;
            PorterDuff.Mode mode = IconCompat.k;
            context2.getClass();
            IconCompat iconCompatC = IconCompat.c(context2.getResources(), context2.getPackageName(), R.drawable.ic_call_decline);
            Bundle bundle = new Bundle();
            CharSequence charSequenceB = uc7.b(spannableStringBuilder);
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            if (!arrayList5.isEmpty()) {
            }
            i = 0;
            qc7 qc7Var = new qc7(iconCompatC, charSequenceB, null, bundle, arrayList6.isEmpty() ? null : (wm8[]) arrayList6.toArray(new wm8[arrayList6.size()]), true, true, false);
            qc7Var.a.putBoolean("key_action_priority", true);
            ArrayList arrayList7 = new ArrayList(3);
            arrayList7.add(qc7Var);
            ArrayList<qc7> arrayList8 = vc7Var.a.b;
            if (arrayList8 != null) {
                int size = arrayList8.size();
                int i5 = 0;
                while (i5 < size) {
                    qc7 qc7Var2 = arrayList8.get(i5);
                    i5++;
                    qc7 qc7Var3 = qc7Var2;
                    if (qc7Var3.f) {
                        arrayList7.add(qc7Var3);
                    } else if (!qc7Var3.a.getBoolean("key_action_priority")) {
                        arrayList7.add(qc7Var3);
                    }
                }
            }
            int size2 = arrayList7.size();
            int i6 = 0;
            while (i6 < size2) {
                Object obj = arrayList7.get(i6);
                i6++;
                a((qc7) obj);
            }
        } else {
            i = 0;
            ArrayList<qc7> arrayList9 = uc7Var.b;
            int size3 = arrayList9.size();
            while (i4 < size3) {
                qc7 qc7Var4 = arrayList9.get(i4);
                i4++;
                a(qc7Var4);
            }
        }
        Bundle bundle2 = uc7Var.p;
        if (bundle2 != null) {
            this.d.putAll(bundle2);
        }
        this.b.setShowWhen(uc7Var.k);
        this.b.setLocalOnly(uc7Var.o);
        this.b.setGroup(uc7Var.m);
        this.b.setSortKey(null);
        this.b.setGroupSummary(uc7Var.n);
        this.e = i;
        this.b.setCategory(null);
        this.b.setColor(uc7Var.q);
        this.b.setVisibility(uc7Var.r);
        this.b.setPublicVersion(null);
        this.b.setSound(notification.sound, notification.audioAttributes);
        int i7 = Build.VERSION.SDK_INT;
        String str = BuildConfig.FLAVOR;
        if (i7 < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(arrayList3.size());
                int size4 = arrayList3.size();
                int i8 = i;
                while (i8 < size4) {
                    ox7 ox7Var = arrayList3.get(i8);
                    i8++;
                    ox7 ox7Var2 = ox7Var;
                    CharSequence charSequence = ox7Var2.a;
                    String str2 = ox7Var2.c;
                    if (str2 == null) {
                        if (charSequence != null) {
                            str2 = "name:" + ((Object) charSequence);
                        } else {
                            str2 = BuildConfig.FLAVOR;
                        }
                    }
                    arrayList.add(str2);
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    r30 r30Var = new r30(arrayList2.size() + arrayList.size());
                    r30Var.addAll(arrayList);
                    r30Var.addAll(arrayList2);
                    arrayList2 = new ArrayList<>(r30Var);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size5 = arrayList2.size();
            int i9 = i;
            while (i9 < size5) {
                String str3 = arrayList2.get(i9);
                i9++;
                this.b.addPerson(str3);
            }
        }
        if (arrayList4.size() > 0) {
            if (uc7Var.p == null) {
                uc7Var.p = new Bundle();
            }
            Bundle bundle3 = uc7Var.p.getBundle("android.car.EXTENSIONS");
            bundle3 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            int i10 = i;
            while (i10 < arrayList4.size()) {
                String string = Integer.toString(i10);
                qc7 qc7Var5 = arrayList4.get(i10);
                Bundle bundle6 = new Bundle();
                if (qc7Var5.b == null && (i3 = qc7Var5.g) != 0) {
                    qc7Var5.b = IconCompat.c(resources, str, i3);
                }
                IconCompat iconCompat2 = qc7Var5.b;
                Bundle bundle7 = qc7Var5.a;
                ArrayList<qc7> arrayList10 = arrayList4;
                bundle6.putInt("icon", iconCompat2 != null ? iconCompat2.d() : 0);
                bundle6.putCharSequence("title", qc7Var5.h);
                bundle6.putParcelable("actionIntent", qc7Var5.i);
                Bundle bundle8 = bundle7 != null ? new Bundle(bundle7) : new Bundle();
                bundle8.putBoolean("android.support.allowGeneratedReplies", qc7Var5.d);
                bundle6.putBundle("extras", bundle8);
                wm8[] wm8VarArr = qc7Var5.c;
                if (wm8VarArr == null) {
                    bundleArr = null;
                } else {
                    bundleArr = new Bundle[wm8VarArr.length];
                    int i11 = 0;
                    while (i11 < wm8VarArr.length) {
                        wm8 wm8Var = wm8VarArr[i11];
                        wm8[] wm8VarArr2 = wm8VarArr;
                        Bundle bundle9 = new Bundle();
                        wm8Var.getClass();
                        int i12 = i11;
                        bundle9.putString("resultKey", null);
                        bundle9.putCharSequence("label", null);
                        bundle9.putCharSequenceArray("choices", null);
                        Bundle[] bundleArr2 = bundleArr;
                        bundle9.putBoolean("allowFreeFormInput", false);
                        bundle9.putBundle("extras", null);
                        bundleArr2[i12] = bundle9;
                        i11 = i12 + 1;
                        wm8VarArr = wm8VarArr2;
                        bundleArr = bundleArr2;
                    }
                }
                bundle6.putParcelableArray("remoteInputs", bundleArr);
                bundle6.putBoolean("showsUserInterface", qc7Var5.e);
                bundle6.putInt("semanticAction", 0);
                bundle5.putBundle(string, bundle6);
                i10++;
                arrayList4 = arrayList10;
                str = str;
                resources = null;
            }
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            if (uc7Var.p == null) {
                uc7Var.p = new Bundle();
            }
            uc7Var.p.putBundle("android.car.EXTENSIONS", bundle3);
            this.d.putBundle("android.car.EXTENSIONS", bundle4);
        }
        this.b.setExtras(uc7Var.p);
        this.b.setRemoteInputHistory(null);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 26) {
            a.b(this.b);
            a.d(this.b);
            a.e(this.b, uc7Var.t);
            a.f(this.b);
            i2 = 0;
            a.c(this.b, 0);
            if (!TextUtils.isEmpty(uc7Var.s)) {
                this.b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        } else {
            i2 = 0;
        }
        if (i13 >= 28) {
            int size6 = arrayList3.size();
            int i14 = i2;
            while (i14 < size6) {
                ox7 ox7Var3 = arrayList3.get(i14);
                i14++;
                ox7 ox7Var4 = ox7Var3;
                Notification.Builder builder2 = this.b;
                ox7Var4.getClass();
                b.a(builder2, ox7.a.a(ox7Var4));
            }
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 29) {
            c.a(this.b, uc7Var.v);
            Notification.Builder builder3 = this.b;
            tc7 tc7Var = uc7Var.w;
            if (tc7Var == null) {
                bubbleMetadataA = null;
            } else if (i15 >= 30) {
                bubbleMetadataA = tc7.b.a(tc7Var);
            } else if (i15 == 29) {
                bubbleMetadataA = tc7.a.a(tc7Var);
            } else {
                bubbleMetadataA = null;
            }
            c.b(builder3, bubbleMetadataA);
            ld6 ld6Var = uc7Var.u;
            if (ld6Var != null) {
                c.d(this.b, ld6Var.b);
            }
        }
        if (i15 >= 36) {
            e.a(this.b);
        }
        if (uc7Var.y) {
            if (this.c.n) {
                this.e = 2;
            } else {
                this.e = 1;
            }
            this.b.setVibrate(null);
            this.b.setSound(null);
            int i16 = notification.defaults & (-4);
            notification.defaults = i16;
            this.b.setDefaults(i16);
            if (i15 >= 26) {
                if (TextUtils.isEmpty(this.c.m)) {
                    this.b.setGroup("silent");
                }
                a.c(this.b, this.e);
            }
        }
    }

    public final void a(qc7 qc7Var) {
        int i;
        if (qc7Var.b == null && (i = qc7Var.g) != 0) {
            qc7Var.b = IconCompat.c(null, BuildConfig.FLAVOR, i);
        }
        IconCompat iconCompat = qc7Var.b;
        boolean z = qc7Var.d;
        Bundle bundle = qc7Var.a;
        Notification.Action.Builder builder = new Notification.Action.Builder(iconCompat != null ? iconCompat.h(null) : null, qc7Var.h, qc7Var.i);
        wm8[] wm8VarArr = qc7Var.c;
        if (wm8VarArr != null) {
            RemoteInput[] remoteInputArr = new RemoteInput[wm8VarArr.length];
            for (int i2 = 0; i2 < wm8VarArr.length; i2++) {
                wm8VarArr[i2].getClass();
                RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(null).setLabel(null).setChoices(null).setAllowFreeFormInput(false).addExtras(null);
                if (Build.VERSION.SDK_INT >= 29) {
                    wm8.a.a(builderAddExtras);
                }
                remoteInputArr[i2] = builderAddExtras.build();
            }
            for (RemoteInput remoteInput : remoteInputArr) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", z);
        builder.setAllowGeneratedReplies(z);
        bundle2.putInt("android.support.action.semanticAction", 0);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            b.b(builder);
        }
        if (i3 >= 29) {
            c.c(builder, qc7Var.f);
        }
        if (i3 >= 31) {
            d.a(builder);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", qc7Var.e);
        builder.addExtras(bundle2);
        this.b.addAction(builder.build());
    }
}
