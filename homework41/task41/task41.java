import java.util.*;


public class Main {

    private static final int MINUTE = 60;
    private static final int HOUR = 60 * MINUTE;
    private static final int DAY = 24 * HOUR;
    private static final int WEEK = 7 * DAY;
    private static final int MONTH = 30 * DAY;
    private static final int YEAR = 365 * DAY;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        System.out.println(formatTime(seconds));
    }

    public static String formatTime(int seconds) {
        if (seconds < 0) {
            return "Invalid input";
        }
        if (seconds == 0) {
            return "0 секунд";
        }
        StringBuilder sb = new StringBuilder();
        int years = seconds / YEAR;
        if (years > 0) {
            sb.append(years).append(" ").append(years == 1 ? "год" : "года");
            seconds -= years * YEAR;
            if (seconds > 0) {
                sb.append(", ");
            } else {
                sb.append(".");
            }
        }
        int months = seconds / MONTH;
        if (months > 0) {
            sb.append(months).append(" ").append(months == 1 ? "месяц" : "месяца");
            seconds -= months * MONTH;
            if (seconds > 0) {
                sb.append(", ");
            } else {
                sb.append(".");
            }
        }
        int weeks = seconds / WEEK;
        if (weeks > 0) {
            sb.append(weeks).append(" ").append(weeks == 1 ? "неделя" : "недели");
            seconds -= weeks * WEEK;
            if (seconds > 0) {
                sb.append(", ");
            } else {
                sb.append(".");
            }
        }
        int days = seconds / DAY;
        if (days > 0) {
            sb.append(days).append(" ").append(days == 1 ? "день" : "дня");
            seconds -= days * DAY;
            if (seconds > 0) {
                sb.append(", ");
            } else {
                sb.append(".");
            }
        }
        int hours = seconds / HOUR;
        if (hours > 0) {
            sb.append(hours).append(" ").append(hours == 1 ? "час" : "часа");
            seconds -= hours * HOUR;
            if (seconds > 0) {
                sb.append(", ");
            } else {
                sb.append(".");
            }
        }
        int minutes = seconds / MINUTE;
        if (minutes > 0) {
            sb.append(minutes).append(" ").append(minutes == 1 ? "минута" : "минуты");
            seconds -= minutes * MINUTE;
            if (seconds > 0) {
                sb.append(" и ");
            } else {
                sb.append(".");
            }
        }
        if (seconds > 0) {
            sb.append(seconds).append(" ").append(seconds == 1 ? "секунда" : "секунды");
        }
        return sb.toString();
    }
}
