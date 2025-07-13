/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.osprojectcpuscheduler;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Process> processes = new ArrayList<>();
        Scheduler scheduler = null;

        System.out.println("Select input method: [1] Manual [2] Random");
        int inputChoice = sc.nextInt();

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        if (inputChoice == 1) {
            for (int i = 0; i < n; i++) {
                System.out.print("Enter Process ID: ");
                String id = sc.next();
                System.out.print("Enter Arrival Time: ");
                int arrival = sc.nextInt();
                System.out.print("Enter Burst Time: ");
                int burst = sc.nextInt();
                processes.add(new Process(id, arrival, burst));
            }
        } else {
            Random rand = new Random();
            for (int i = 0; i < n; i++) {
                String id = "P" + (i + 1);
                int arrival = rand.nextInt(5); // e.g., 0-4
                int burst = rand.nextInt(8) + 1; // e.g., 1-8
                processes.add(new Process(id, arrival, burst));
                System.out.println("Generated: " + id + " Arrival: " + arrival + " Burst: " + burst);
            }
        }

