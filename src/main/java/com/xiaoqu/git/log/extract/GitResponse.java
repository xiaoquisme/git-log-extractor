package com.xiaoqu.git.log.extract;

import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GitResponse {
    public String sha;
    public Commit commit;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Commit {
        public Committer committer;
        public String message;

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Committer {
            public String name;
            public String email;
            public String date;
        }
    }
}
